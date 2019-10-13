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
        int[]arr2nd = insertArray(arr,location,insertValue);
        Functions.show(arr2nd);

    }

    public static int[] insertArray(int[]arr,int location, int insertValue){
        int length = arr.length+1;
        int[] arr2nd = new int[length];
        System.arraycopy(arr, 0, arr2nd, 0, arr.length);
        Functions.show(arr2nd);
        for (int i = arr2nd.length -1; i >= location; i--){
            arr2nd[i+1] = arr2nd[i];
        }
        arr2nd[location]= insertValue;
        return arr2nd;
    }
}
