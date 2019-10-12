package Array_And_Method.Practice;

import Functions.Functions;
import java.util.Scanner;

public class SwitchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = Functions.createMatrix(size);
        System.out.print("arr is: ");
        Functions.show(arr);
        System.out.println(" ");
        System.out.print("Switch of arr is: ");
        int[] newArr = switchArray(arr,size);
        Functions.show(newArr);
    }
    private static int[] switchArray(int[] arr,int size){
        for (int  i = 0 ; i < arr.length /2 ; i++){
            int temp = arr[i];
            arr[i] = arr[size - i -1];
            arr[size - i -1] = temp;
        }
        return arr;
    }
}
