package Basic_java.Exercise;
import static java.lang.Math.*;
import java.util.Scanner;

public class Prime_less_than_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i <= 100; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
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
