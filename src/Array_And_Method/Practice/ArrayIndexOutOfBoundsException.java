package Array_And_Method.Practice;

import Functions.Functions;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = Functions.createMatrix(size);
        System.out.print("Array is: ");
        Functions.show(arr);
        System.out.print("Enter position you want to find");
        int pos = scanner.nextInt();
        try {
            System.out.println("value of arr in ' " + pos + " ' is:  " + arr[pos]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("No pos");
        }
    }
}
