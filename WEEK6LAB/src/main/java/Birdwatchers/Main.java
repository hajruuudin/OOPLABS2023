package Birdwatchers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        BirdDatabase birdDatabase = new BirdDatabase();
        Scanner reader = new Scanner(System.in);

        System.out.println("Birdwatchers database program. Please use the following syntax:");
        System.out.println("Add - Add a bird with its name and latin name");
        System.out.println("Observation - Increase observation by 1 for input bird");
        System.out.println("Statistics - show birds with their observation count");
        System.out.println("Show - show particular bird statistics");
        System.out.println("Quit - exit the programme");

        // Rough programme example. Could be improved by replacing each case with corresponding
        // methods in the BirdDatabase class, or by implementing a class solely for these methods.

        while(true){

            System.out.print("?");
            String userIn = reader.next();

            if(userIn.equals("Add")){
                //Adding function - bird to a database
                System.out.print("Name:");
                String birdName = reader.next();

                System.out.print("Latin Name:");
                String birdLatinName = reader.next();

                birdDatabase.add(new Bird(birdName, birdLatinName));

            } else if (userIn.equals("Observation")){
                //Observation function - increase observation for a bird
                System.out.print("What is being observed?");
                String birdName = reader.next();

                int containsTest = birdName.indexOf(birdName);

                if(containsTest == -1){
                    System.out.println("Is not a bird!");
                } else {
                    birdDatabase.increaseObservation(birdName);
                }

            } else if (userIn.equals("Statistics")){
                //Statistics function - print all bird statistics
                birdDatabase.showStatistics();

            } else if (userIn.equals("Show")){
                //Show function - show particular bird statistics
                System.out.print("What?");
                String birdName = reader.next();
                birdDatabase.show(birdName);

            } else if (userIn.equals("Quit")){
                break;
            } else {
                System.out.println("Invalid input! Please follow the given syntax!");
            }
        }

//        Optional: Same code but with switch case:
//        while(true){
//            System.out.print("?");
//            String userIn = reader.next();
//
//            switch (userIn) {
//                case "Add": {
//                    System.out.print("Name:");
//                    String birdName = reader.next();
//
//                    System.out.print("Latin Name:");
//                    String birdLatinName = reader.next();
//
//                    birdDatabase.add(new Bird(birdName, birdLatinName));
//                    break;
//                }
//                case "Observation": {
//                    System.out.print("What is being observed?");
//                    String birdName = reader.next();
//
//                    int containsTest = birdName.indexOf(birdName);
//
//                    if (containsTest == -1) {
//                        System.out.println("Is not a bird!");
//                    } else {
//                        birdDatabase.increaseObservation(birdName);
//                    }
//                    break;
//                }
//                case "Statistics":
//                    birdDatabase.showStatistics();
//                    break;
//                case "Show": {
//                    System.out.print("What?");
//                    String birdName = reader.next();
//
//                    birdDatabase.show(birdName);
//                    break;
//                }
//                case "Quit":
//                    break label;
//                default:
//                    System.out.println("Invalid input! Please follow the given syntax!");
//                    break;
//            }
//        }
    }
}
