package LabTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        StudentSystem newSystem = new StudentSystem("students.csv");
        for(Student student : newSystem.getStudents()){
            System.out.println(student);
        }
        Optional<Student> studentByID = newSystem.getStudentById(10);
        System.out.println(studentByID);
        System.out.println(newSystem.getHighestGPAStudent());
        System.out.println(newSystem.getLongestNameStudent());
    }
}
