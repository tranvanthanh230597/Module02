package Array_And_Method.Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 length of Triangle: ");
        int len01 =scanner.nextInt();
        int len02 =scanner.nextInt();
        int len03 =scanner.nextInt();
        try{
            System.out.println(len01+ " "+ len02 +" and "+ len03 + "is 3 length of Triangle");
        }
        catch (InputMismatchException e){
            System.out.println("input false !!!!");
        }
    }
}
