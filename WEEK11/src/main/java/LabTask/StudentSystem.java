package LabTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {
    private List<Student> students;

    public StudentSystem(String filename){
        this.students = readStudents(filename);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> readStudents(String filename){
        List<Student> students = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            List<String> stringsOfStudents;
            stringsOfStudents = reader.lines().collect(Collectors.toList());

            for(String line : stringsOfStudents){
                String[] lineSplit = line.split(",");

                int ID = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                String university = lineSplit[2];
                String department = lineSplit[3];
                double GPA = Double.parseDouble(lineSplit[4]);

                Student student = new Student(ID, name, university, department, GPA);
                students.add(student);
                reader.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return students;
    }

    public Optional<Student> getStudentById(int ID){
        for (Student student : this.students){
            if(student.getID() == ID){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public Student getHighestGPAStudent() throws EmptyStudentListException{

        if(this.students.isEmpty()){
            throw new EmptyStudentListException("List is empty");
        }

        double currentHighestGPA = this.students.get(0).getGPA();
        int position = 0;
        for(int i = 0; i < this.students.size(); i++){
            if(this.students.get(i).getGPA() >= currentHighestGPA){
                position = i;
                currentHighestGPA = this.students.get(i).getGPA();
            }
        }

        return this.students.get(position);
    }

    public Student getLongestNameStudent() throws EmptyStudentListException{
        if(this.students.isEmpty()){
            throw new EmptyStudentListException("List is empty");
        }

        int currentLength = this.students.get(0).getName().length();
        int position = 0;

        for(int i = 0; i < this.students.size(); i++){
            if(this.students.get(i).getName().length() >= currentLength){
                position = i;
                currentLength = this.students.get(i).getName().length();
            }
        }

        return this.students.get(position);
    }
}
