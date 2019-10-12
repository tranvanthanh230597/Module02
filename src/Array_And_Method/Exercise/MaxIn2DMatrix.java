package Array_And_Method.Exercise;

import Functions.Functions;

import java.util.Scanner;

public class MaxIn2DMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height of matrix: ");
        int height = scanner.nextInt();
        System.out.println("Enter width of matrix: ");
        int width = scanner.nextInt();
        int[][]arr = Functions.create2DMatrix(height,width);
        Functions.Show2DMatrix(arr,height,width);
        System.out.println("Max in 2D array is: "+maxOf2DArray(arr,height,width));
    }

    private static int maxOf2DArray (int[][] arr, int height, int width){
        int max = arr[0][0];
        for (int i = 0 ; i < height ; i++){
            for (int j = 0; j < width; j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
