package Basic_java.Exercise;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        final double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your money (USD): ");
        usd = scanner.nextDouble();
        double change = usd * vnd ;

        System.out.println("Your money (vnd) : " +change+ "vnd");

    }
}
