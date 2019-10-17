package BaiTap.Human;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String humanName01 = "";
        String humanName02 = "";
        int humanWeight01 = 0;
        int humanWeight02 = 0;
        int appleWeight = 0;

        Scanner scanner = new Scanner(System.in);
        while(humanName01.equals("")){
            System.out.print("Enter Human name: ");
            humanName01 = scanner.nextLine();
        }
        while(humanWeight01 <= 0){
            System.out.print("Enter Human weight: ");
            humanWeight01 = scanner.nextInt();
        }
        while(humanName02.equals("")){
            System.out.print("Enter Human name: ");
            humanName02 = scanner.nextLine();
        }
        while(humanWeight02 <= 0){
            System.out.print("Enter Human weight: ");
            humanWeight02 = scanner.nextInt();
        }
        while(appleWeight <= 0){
            System.out.print("Enter apple weight: ");
            appleWeight = scanner.nextInt();
        }

        Human human01 = new Human(humanName01,humanWeight01);
        Human human02 = new Human(humanName02,humanWeight02);
        Apple apple= new Apple(appleWeight);
        System.out.println("Menu");
        System.out.println("1. "+ human01.getName()+" Eat");
        System.out.println("2. "+ human02.getName()+" Eat");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (apple.getWeight() >= 0){

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    human01.eat(apple);
                    break;
                case 2:
                    human02.eat(apple);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
