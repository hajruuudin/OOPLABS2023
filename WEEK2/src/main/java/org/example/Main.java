package org.example;
import java.util.Objects;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//        Exercise 1
//        String pass = "baklava";
//        System.out.println("Enter the password: ");
//        String userPass = reader.nextLine();
//
//        while(!pass.equals(userPass)){
//            System.out.println("Wrong, try again!");
//            userPass = reader.nextLine();
//            if (Objects.equals(userPass, pass)){
//                System.out.println("Correct! Secret message: baklava is nice");
//            }
//
//        Exercise 2
//        int sum = 0;
//        int read;
//
//        System.out.print("Enter the first number: ");
//        read = Integer.parseInt(reader.next());
//        sum += read;
//        System.out.print("Enter the second number: ");
//        read = Integer.parseInt(reader.next());
//        sum += read;
//        System.out.print("Enter the third number: ");
//        read = Integer.parseInt(reader.next());
//        sum += read;
//        System.out.println("Their sum is: " + sum);

//        Exercise 3
//        int num = Integer.parseInt(reader.nextLine());
//        int sum = num;
//        while(num != 0){
//            System.out.println("Sum now: " + sum);
//            num = Integer.parseInt(reader.nextLine());
//            sum += num;
//        }
//
//        System.out.println("Sum in the end: " + sum);

//        Exercise 4
//        System.out.println("First: ");
//        int lower = Integer.parseInt(reader.next());
//        System.out.println("Second: ");
//        int upper = Integer.parseInt(reader.next());
//
//        if(lower < upper){
//            while(lower <= upper){
//                System.out.println(lower);
//                lower += 1;
//            }
//        }

//        Exercise 5
//        int sum = 0;
//        System.out.println("Type a number: ");
//        int num = Integer.parseInt(reader.next());
//        int i = 0;
//
//        while(i <= num){
//            sum += (int)Math.pow(2, i);
//            i++;
//        }
//
//        System.out.println("Result is: " + sum);

//        Exercise 6
//        System.out.println("Print how many times?");
//        int num = Integer.parseInt(reader.nextLine());
//        for(int i = 0; i< num; i++) {
//            printText();
//        }

//        Exercise 7
//        printStars(7);
//        printStars(4);

//        Exercise 8
//        drawStarPyramid(7);

//        Exercise 9
//        drawNumberPyramid(7);



    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void printStars(int amount){
        for(int i = 0; i < amount; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void drawStarPyramid(int rows){
        for(int i = 1; i < rows + 1; i++){
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // For the inverted row we change the first loop so that is goes from the max row up until zero
    }

    public static void drawNumberPyramid(int rows){
        for(int i = 1; i < rows + 1; i++){
            for(int j = 1; j < i+1; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //To output the modified code, we put system.out.print(i) instead of j at line 117;
    }

}


