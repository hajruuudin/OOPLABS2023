package ArrayTasks;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args){
        int[] values = {3,2,5,4,8};

        System.out.println(Arrays.toString(values));

        swap(values, 1, 0);

        System.out.println(Arrays.toString(values));

        swap(values, 0, 3);

        System.out.println(Arrays.toString(values));
    }

    public static void swap(int[] arr, int a, int b){
        int first = arr[a];
        int second = arr[b];

        int temp = first;
        first = second;
        second = temp;

        arr[a] = first;
        arr[b] = second;
    }
}
