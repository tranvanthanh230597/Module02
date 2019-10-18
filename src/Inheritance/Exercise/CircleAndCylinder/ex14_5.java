package Inheritance.Exercise.CircleAndCylinder;

import java.util.Scanner;

public class ex14_5 {
    public static void main(String[] args) {
        double radius,height;
        String color;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter color: ");
        color = scanner.nextLine();
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        Circle cir = new Circle();
        Cylinder cyl = new Cylinder();
        cir.setRadius(radius);
        cir.setColor(color);
        cyl.setRadius(radius);
        cyl.setColor(color);
        cyl.setHeight(height);
        System.out.println(cir.info());
        System.out.println(cyl.info());
    }
}
