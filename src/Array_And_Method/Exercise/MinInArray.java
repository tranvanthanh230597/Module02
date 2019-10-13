package Array_And_Method.Exercise;

import Functions.Functions;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = Functions.createMatrix(size);
        System.out.print("Array is: ");
        Functions.show(arr);
        System.out.println("Min of array is: "+minArray(arr));

    }
    public static int minArray(int[]arr){
        int min = arr[0];
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}
