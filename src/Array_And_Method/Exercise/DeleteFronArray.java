package Array_And_Method.Exercise;

import Functions.Functions;

import java.util.Scanner;

public class DeleteFronArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = scanner.nextInt();
        int[] arr = Functions.createMatrix(size);
        System.out.print("Arr is : ");
        Functions.show(arr);
        System.out.println(" ");
        System.out.print("Enter munber in array you want delete: ");
        int num = scanner.nextInt();
        int[]arr2nd = delFromArray(arr,num);
        Functions.show(arr2nd);

    }

    private static int[] delFromArray(int[]arr,int num){
        int length = arr.length;
        int c;
        for(int i = c = 0; i <length; i++ ){
            if(arr[i] != num){
                arr[c] = arr[i];
                c++;
            }
        }
        int[] arr2nd = new int[c];
        for (int i = 0; i < c; i++){
            arr2nd[i] = arr[i];
        }
        return arr2nd;
    }
}
