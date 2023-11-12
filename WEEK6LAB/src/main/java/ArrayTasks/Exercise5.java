package ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        int[] array = {-3,2,3,4,7,8,12};
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the searched array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter the searched number: ");
        int searchedValue = Integer.parseInt(reader.next());

        boolean isInBinary = search(array, searchedValue);

        if(isInBinary){
            System.out.println("Value " + searchedValue + " is in the array");
        } else {
            System.out.println("Value " + searchedValue + " is not in the array");
        }


    }

    public static boolean search(int[] arr, int value){
        int len = 0;
        int range = arr.length;

        while(len <= range){
            int midpoint = len + (range - 1) / 2;

            if(arr[midpoint] == value){
                return true;
            }

            if(arr[midpoint] < value){
                len = midpoint + 1;
            } else {
                range = midpoint - 1;
            }
        }
        return false;
    }
}
