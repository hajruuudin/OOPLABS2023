package ArrayTasks;

public class Exercise6 {
    public static void main(String[] args){
        int[] array = {5,1,3,4,2};
        printElegantly(array);
    }

    public static void printElegantly(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
