import java.util.Scanner;

public class TH_Interest {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        double total_interset = 0;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = scanner.nextDouble();

        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
