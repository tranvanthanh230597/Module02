package Basic_java.Practice;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float arena = width * height ;
        System.out.println("Arena is: " + arena);
    }
}
