package ArrayTasks;

public class Exercise3 {
    public static void main(String[] args){
        int[] values = {4,8,2,5,6,0,19,2,4,10,3,1,10,6,8,8,8,3};

        System.out.println(indexOfSmallestStartingFrom(values, 3));
        System.out.println(indexOfSmallestStartingFrom(values, 6));
        System.out.println(indexOfSmallestStartingFrom(values, 12));
    }

    public static int indexOfSmallestStartingFrom(int[] arr, int index){
        int smallest = index;

        for(int i = index; i < arr.length; i++){
            if(arr[i] < arr[smallest]){
                smallest = i;
            }
        }

        return smallest;
    }
}
