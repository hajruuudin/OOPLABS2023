package org.example;

import java.util.ArrayList;

public class Student extends Person{
    private int credits;
    private int student_id;
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    public Student(String name, String address, int age, String country) {
        super(name, address, age, country);
        this.credits = 0;
    }

    public String getCredits() {
        return "credits " + this.credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStudent_id() {return student_id;}

    public void setStudent_id(int student_id) {this.student_id = student_id;}

    public void study(){
        this.credits++;
    }

    public void addGrade(int newGrade){
        if(newGrade <= 5 && newGrade >0) {
            this.grades.add(newGrade);
        } else {
            System.out.println("The grade you entered was not valid!");
        }
    }
}
