package Array_And_Method.Exercise.IllegalTriangleExceptionAssignments;

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
            CheckTriangle.checkTriangle(len01, len02, len03);
        }
        catch (Exception01 | Exception02 e){
            System.out.println(e.getMessage());
        }
    }
}
