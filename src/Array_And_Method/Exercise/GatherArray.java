package Array_And_Method.Exercise;

import Functions.Functions;

import java.util.Scanner;

public class GatherArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int size1st = scanner.nextInt();
        System.out.print("Enter size of second array:");
        int size2nd = scanner.nextInt();

        int[] arr1st = Functions.createMatrix(size1st);
        int[] arr2nd = Functions.createMatrix(size2nd);

        int size3th = size1st +size2nd;
        int[] arr3th = new int[size3th];
        System.arraycopy(arr1st, 0, arr3th, 0, arr1st.length);
        System.arraycopy(arr2nd, 0, arr3th, size1st + 0, arr2nd.length);
        System.out.print("First array: "); Functions.show(arr1st);
        System.out.print("Second array: "); Functions.show(arr2nd);
        System.out.print("3th array: "); Functions.show(arr3th);


    }
}
