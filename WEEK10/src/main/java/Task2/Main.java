package Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class Student{
    private String name;
    private int ID;
    private ArrayList<Integer> grades;

    public Student(String name, int ID, ArrayList<Integer> grades) {
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo(){
        System.out.println("Student: " + this.name + "\nID: " + this.ID + "\nGrades: " + this.grades);
    }
}

class GradeAnalyzer{
    private ArrayList<Integer> grades;

    public GradeAnalyzer(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for(int grade : this.grades){
            sum += grade;
        }

        return (double) sum / (double) this.grades.size();
    }

    public void printSummary() {
        System.out.println("Grade Summary:");
        System.out.println("Grades: " + this.grades);
        System.out.println("Average Grade: " + calculateAverage());
    }
}

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(5);
        grades.add(3);
        grades.add(2);
        grades.add(4);

        GradeAnalyzer analyzer = new GradeAnalyzer(grades);
        Field[] gradeAnalyzerFields = analyzer.getClass().getFields();
        Method[] gradeAnalyzerMethods = analyzer.getClass().getDeclaredMethods();

        for(Field f : gradeAnalyzerFields){
            System.out.println(f.getName());
        }

        for(Method f : gradeAnalyzerMethods){
            if(f.getName().contains("print") || f.getName().contains("calculate")){
                System.out.println(f.getName());
                f.invoke(analyzer);
            }
        }
    }
}
