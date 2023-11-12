package ArrayTasks;

public class Exercise2 {
    public static void main(String[] args){
        int[] values = {7,10,8,2,11};

        System.out.println("Index of smallest: " + indexOfSmallest(values));
    }

    public static int indexOfSmallest(int[] arr){
        int smallest = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[smallest]){
                smallest = i;
            }
        }

        return smallest;
    }
}
