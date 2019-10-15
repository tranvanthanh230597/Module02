package Class_And_Object.Exercise.QuadraticEquations;

import java.util.Scanner;

public class Ex14_2 {
    public static void main(String[] args) {
        double a = 0,b,c;
        Scanner scanner =new Scanner(System.in);
        System.out.println("QuadraticEquation ");
        System.out.print("Enter a:  "); a = scanner.nextDouble();
        while (a == 0){
            System.out.print("Enter a:  "); a = scanner.nextDouble();
        }
        System.out.print("Enter b:  "); b = scanner.nextDouble();
        System.out.print("Enter c:  "); c = scanner.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a,b,c);
        double delta = quadratic.getDiscriminant();
        if (delta < 0 ){
            System.out.println("The equation has no roots");
        }
        else if(delta == 0){
            System.out.println("The equation has one root: " +quadratic.getRoot1());
        }
        else{
            System.out.println("The equation has two root: " +quadratic.getRoot1()+ " and "+ quadratic.getRoot2());
        }
        System.out.println("");
    }
}
