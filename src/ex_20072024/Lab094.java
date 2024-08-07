package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {

        // Take a user input as char and Tell the user if it is a vowel
        // a, e, i, o, u

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char: ");
        char vowel_check = sc.next().charAt(0);



 /*       switch (vowel_check){
            case 'a':
                System.out.println("a is a vowel");
                break;
            case 'e':
                System.out.println("e is a vowel");
                break;
            case 'i':
                System.out.println("i is a vowel");
                break;
            case 'o':
                System.out.println("o is a vowel");
                break;
            case 'u':
                System.out.println("u is a vowel");
                break;
            default:
                System.out.println("Not a vowel");
                break;
        }

        // Or

        switch (vowel_check) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("i is a vowel");
                break;
            default:
                System.out.println("Not a vowel");

        }*/
      // or

        switch (vowel_check) {
            case 'a', 'e', 'i', 'o', 'u' ->  System.out.println("vowel");
            default -> System.out.println("Not a vowel");

        }
    }
}
