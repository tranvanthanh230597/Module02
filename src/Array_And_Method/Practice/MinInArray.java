package Array_And_Method.Practice;

import Functions.Functions;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = Functions.createMatrix(size);
        Functions.show(arr);
        System.out.println(" ");
        System.out.println("Max of arr is: " +min(arr));

    }
    private static int min(int[] arr){
        int min = arr[0];
        for (int i=1 ; i <arr.length; i++){
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}
