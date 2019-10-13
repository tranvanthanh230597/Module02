package Array_And_Method.Exercise;

import Functions.Functions;

import java.util.Scanner;

public class TotalOfColumnIn2DMatrix {
    public static void main(String[] args) {
        int width,height,col = -1;
        boolean checkCol = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width of array 2D: ");
        width = scanner.nextInt();
        System.out.print("Enter height of array 2D: ");
        height = scanner.nextInt();
        int[][] arr = Functions.create2DMatrix(height,width);
        Functions.Show2DMatrix(arr,height,width);

        while (!Functions.checkColIn2DMatrix(arr, height, width, col)){
            System.out.print("Enter column your want to total: ");
            col = scanner.nextInt();
        }
        System.out.println("");
        System.out.print("column "+ col + " has total:" + totalOfColumn(arr,height,width,col));
    }

    private static int totalOfColumn(int[][] arr, int height, int width,int col){
        int total = 0;
        for (int i = 0 ; i < height ; i++){
            for (int j = 0; j < width; j++){
                if(col == j){
                    total += arr[i][j];
                }
            }
        }
        return total;
    }
}
