package Array_And_Method.Exercise;

import Functions.Functions;

import java.util.Scanner;

public class TotalOfDiagonalLineInArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of array 2D: ");
        int num = scanner.nextInt();
        int[][] arr = Functions.create2DMatrix(num,num);
        Functions.Show2DMatrix(arr,num,num);
        System.out.print("Total Of Diagonal Line is : "+totalOfDiagonalLine(arr,num) );
    }

    public static int totalOfDiagonalLine(int[][] arr, int num){
        int total = 0;
        for (int i = 0; i <num; i++){
                total += arr[i][num-1-i];
        }
        for (int i = 0; i <num; i++){
            for (int j = 0; j <num; j++){
                if (i == j){
                    total += arr[i][j];
                }
            }
        }

        return total;
    }
}
