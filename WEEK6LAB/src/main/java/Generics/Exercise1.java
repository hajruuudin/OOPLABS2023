package Generics;

import java.util.List;

public class Exercise1 {
    public static <T extends Number> void calculateNumberSum(List <T> numbers) {
        double evenSum = 0;
        double oddSum = 0;

        for (T number: numbers) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(1,4,6,5,4,6,8);
        List <Double> dubs = List.of(2.1, 4.0, 3.4, 3.1);

        calculateNumberSum(ints);
        calculateNumberSum(dubs);
    }
}
