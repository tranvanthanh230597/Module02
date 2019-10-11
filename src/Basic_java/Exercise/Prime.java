package Basic_java.Exercise;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of prime: ");
        int amount = scanner.nextInt();
        int count = 0;
        for( int i = 0; count <= amount; i++){
            if (isPrime(i)){
                System.out.print(i+ " ");
                count++;
            }
        }
    }

    private static boolean isPrime(int num){
        if (num <= 1) {
            return false;

        }
        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
