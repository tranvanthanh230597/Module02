package BaiTap.Batterys;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lampName01 = "";
        String lampName02 = "";
        int energy = -1;
        while (lampName01.equals("")){
            System.out.print("Enter lamp name: ");
            lampName01 = scanner.nextLine();
        }
        while (lampName02.equals("")){
            System.out.print("Enter lamp name: ");
            lampName02 = scanner.nextLine();
        }
        while(energy < 0){
            System.out.print("Enter energy : ");
            energy = scanner.nextInt();
        }
        Battery battery = new Battery(energy);
        FlashLamp lamp01 = new FlashLamp(lampName01,false);
        FlashLamp lamp02 = new FlashLamp(lampName02,false);

        System.out.println("Menu");
        System.out.println("1. "+ lamp01.getNameLamp()+" turn on");
        System.out.println("2. "+ lamp02.getNameLamp()+" turn on");
        System.out.println("3. "+ lamp01.getNameLamp()+" turn off");
        System.out.println("4. "+ lamp02.getNameLamp()+" turn off");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while (battery.getEnergy() >= 0){

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    lamp01.turnOn(battery);
                    break;
                case 2:
                    lamp02.turnOn(battery);
                    break;
                case 3:
                    lamp01.turnOff(battery);
                    break;
                case 4:
                    lamp02.turnOff(battery);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }


    }
}
