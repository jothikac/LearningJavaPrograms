package ex_20072024;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        // Program to Find the Largest Among Three Numbers:

        // a, b , c

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();

        System.out.println("enter Second number");
        int num2 = sc.nextInt();

        System.out.println("enter Third number");
        int num3 = sc.nextInt();

       /* if(num1 > num2 && num1 > num3){
            System.out.println("First is the largest");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("Second number is largest");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println("Third number is largest");
        }
        else{
            System.out.println("all are equal");
        }
*/
        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}
