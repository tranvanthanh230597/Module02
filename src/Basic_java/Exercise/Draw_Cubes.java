package Basic_java.Exercise;

import java.util.Scanner;

public class Draw_Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter height: ");
                    int recHeight = scanner.nextInt();
                    System.out.println("Enter width");
                    int recWidth = scanner.nextInt();
                    for (int i = 0 ; i < recHeight; i++){
                        for (int j = 0 ; j < recWidth ; j ++){
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }

                    break;
                case 2:
                    System.out.print("Enter height: ");
                    int triHeight = scanner.nextInt();
                    for (int i = 1 ; i <= triHeight; i++){
                        for (int j = 0 ; j < i ; j++){
                            System.out.print("* ");
                        }
                        System.out.println(" ");
                    }


                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
