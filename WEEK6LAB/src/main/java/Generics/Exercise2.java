package Generics;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static <T> List <T> reverseList(List <T> originalList) {
        List<T> reversedList = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }

    public static void main(String[] args) {
        List<String> fruits = List.of("Banana", "Apple", "Orange");
        List<Integer> nums = List.of(1,4,5,6,7,8,9);

        List<String> newfruits = reverseList(fruits);
        List<Integer> newNums = reverseList(nums);

        System.out.println(newfruits);
        System.out.println(newNums);
    }
}
