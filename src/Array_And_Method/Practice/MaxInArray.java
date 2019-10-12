package Array_And_Method.Practice;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = createMatrix(size);
        show(arr);
        System.out.println(" ");
        System.out.println("Max of arr is: " +max(arr));

    }
    private static int max(int[] arr){
        int max = arr[0];
        for (int i=1 ; i <arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
    private static int[] createMatrix(int num){
        int[]arr = new int[num];
        for (int i = 0 ; i <num ; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    private static void show(int[] arr){
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}
