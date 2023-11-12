package ArrayTasks;

public class Exercise1 {
    public static void main(String[] args) {
        int[] nums = {4,5,2,10,9,4};
        System.out.println(smallest(nums));
    }

    public static int smallest(int[] arr){
        int smallest = arr[0];

        for(int num : arr){
            if (num < smallest){
                smallest = num;
            }
        }

        return smallest;
    }
}