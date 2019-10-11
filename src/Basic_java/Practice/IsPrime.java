package Basic_java.Practice;

import java.util.Scanner;
import static java.lang.Math.*;


public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        if (num < 2 ){
            System.out.println(num + " is not prime ");
        }
        else{
            int i = 2;
            boolean check = true;

            while (i <= sqrt(num)){
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(num + " is a prime");
            else
                System.out.println(num + " is not a prime");
        }
    }
}
