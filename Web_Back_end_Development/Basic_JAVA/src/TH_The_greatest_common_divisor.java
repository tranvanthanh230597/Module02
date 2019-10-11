import java.util.Scanner;
import static java.lang.Math.*;

public class TH_The_greatest_common_divisor {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();
        //trả về giá trị tuyệt đối
        a = abs(a);
        b = abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
