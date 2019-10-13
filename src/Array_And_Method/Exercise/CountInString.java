package Array_And_Method.Exercise;

import java.util.Scanner;

public class CountInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String");
        String str = scanner.nextLine();
        System.out.println("");
        String character = "";
        while (character.length() != 1){
            System.out.print("Enter char you want to count: ");
            character = scanner.nextLine();
        }
        int count = findChar(str,character);
        if (count > 0){
            System.out.println("Character: "+character +" is find " + count+" times");
        }
        else{
            System.out.println("can not find ' "+character+" '");
        }

    }
    static public int findChar(String str, String character){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char charStr = str.charAt(i);
            if (Character.toString(charStr).equals(character)){
                count ++;
            }
        }
        return count;
    }
}
