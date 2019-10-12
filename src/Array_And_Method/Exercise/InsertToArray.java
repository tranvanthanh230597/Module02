package Array_And_Method.Exercise;

import Functions.Functions;

import java.util.Scanner;

public class InsertToArray {
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
            System.out.print("Enter location in array you want insert: ");
            location = scanner.nextInt();
        }

        System.out.print("Enter value you want insert: ");
        int insertValue = scanner.nextInt();

    }

}
