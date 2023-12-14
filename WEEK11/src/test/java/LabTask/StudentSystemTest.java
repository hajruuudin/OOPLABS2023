package LabTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.Assert.*;

public class StudentSystemTest {
    @Test
    public void testIfStudentIsPresent(){
        StudentSystem testSystem = new StudentSystem("students.csv");
        assertTrue("We expect that there is at least one student", !testSystem.getStudents().isEmpty());
    }

    @Test
    public void testStudentWithID100(){
        StudentSystem testSystem = new StudentSystem("students.csv");

        boolean isTrue = true;

        for(Student student : testSystem.getStudents()){
            if(testSystem.getStudentById(100).isEmpty()){
                isTrue = false;
            }
        }
        assertFalse("We expect there to be a student with ID100", isTrue);
    }

    @Test
    public void testStudentNull(){
        StudentSystem testSystem = new StudentSystem("students.csv");

        assertTrue("We test to see if the student isnt null!", testSystem.getStudents().get(1) != null);
    }

    @Test
    public void testHighestGPAStudent(){
        StudentSystem testSystem = new StudentSystem("students.csv");

        assertNotNull("We expect there to be a student with highest GPA", testSystem.getHighestGPAStudent());
    }

    @Test
    public void testNamesArray(){
        StudentSystem testSystem = new StudentSystem("students.csv");

        String[] expectedNames = {"Camila Wood","Alexander Thompson","Liam Taylor","Evelyn Jenkins","Michael Jackson"};
        String[] actualNames = {"1", "2", "3", "4", "5"};

        for(int i = 0; i < 5; i++){
            actualNames[i] = testSystem.getStudents().get(i).getName();
        }

        assertArrayEquals(expectedNames, actualNames);
    }

    @Test
    public void testSize(){
        StudentSystem testSystem = new StudentSystem("students.csv");

        assertTrue("We check to see if the size is 70!", testSystem.getStudents().size() == 70);
    }

    @Test
    public void testLargestName(){
        StudentSystem testSystem = new StudentSystem("students.csv");

        Student currentStudent = testSystem.getStudents().get(0);

        for(Student student : testSystem.getStudents()){
            if(student.getName().length() > currentStudent.getName().length()){
                currentStudent = student;
            }
        }

        assertFalse("We check to see that the largest name is not Ava White", currentStudent.getName().equals("Ava White"));
    }

    @Test
    public void testStudents(){
        StudentSystem testSystem = new StudentSystem("students.csv");
        Student highestGPA = testSystem.getHighestGPAStudent();
        Student longestName = testSystem.getLongestNameStudent();

        assertNotEquals(highestGPA, longestName);
    }
}