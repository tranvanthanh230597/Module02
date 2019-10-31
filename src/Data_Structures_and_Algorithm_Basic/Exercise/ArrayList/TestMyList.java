package Data_Structures_and_Algorithm_Basic.Exercise.ArrayList;

import java.util.Scanner;

public class TestMyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyList<Integer> demo = new MyList<>(4);
        demo.set(0,12);
        demo.set(1,121);
        demo.set(2,1233);
        demo.set(3,1111233);
        demo.add(999);
        System.out.println("demo: "+demo);
        System.out.println("clone 01: " +demo.clone());
        System.out.print("input index u want to get : "); int value01 = scanner.nextInt();
        System.out.println("elements["+value01+"] is: " + demo.get(value01));

        System.out.print("input value want to find index : "); int value02 = scanner.nextInt();
        if (demo.indexOf(value02) == -1){
            System.out.println("can not find: "+ value02);
        }
        else{
            System.out.println(value02 +" find in: " + demo.indexOf(value02));
        }

        System.out.print("input value want to find : "); int value03 = scanner.nextInt();
        if (demo.contains(value03)){
            System.out.println("oke");
        }
        else{
            System.out.println("not oke");
        }

        System.out.println("size of demo: " +demo.size());
        System.out.print("input index remove: "); int index = scanner.nextInt();
        System.out.println("demo after remove: "+demo);

    }

}
