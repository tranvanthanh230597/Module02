package Array_And_Method.Practice;

import javafx.scene.effect.Blend;

import java.util.Scanner;

public class SwitchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = createMatrix(size);
        show(arr);
        System.out.println(" ");
        System.out.print("Switch of arr is: ");
        int[] newArr = switchArray(arr,size);
        show(newArr);

    }
    private static int[] switchArray(int[] arr,int size){
        for (int  i = 0 ; i < arr.length /2 ; i++){
            int temp = arr[i];
            arr[i] = arr[size - i -1];
            arr[size - i -1] = temp;
        }
        return arr;
    }
    private static int[] createMatrix(int num){
        int[]arr = new int[num];
        for (int i = 0 ; i <num ; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    private static void show(int[] arr){
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}
