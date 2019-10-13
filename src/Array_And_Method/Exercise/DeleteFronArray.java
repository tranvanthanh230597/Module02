package Array_And_Method.Exercise;

import Functions.Functions;

import java.util.Scanner;

public class DeleteFronArray {
    public static void main(String[] args) {
        int location = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = scanner.nextInt();
        int[] arr = Functions.createMatrix(size);
        System.out.print("Arr is : ");
        Functions.show(arr);
        System.out.println(" ");

        while (Functions.checkLocation(arr,location)){
            System.out.print("Enter location in array you want delete: ");
            location = scanner.nextInt();
        }
        int[]arr2nd = delFromArray(arr,location);
        Functions.show(arr2nd);

    }

    public static int[] delFromArray(int[]arr,int location){
        for (int i = location; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }
        return arr;
    }
}
