package ex_20072024;

import java.util.Scanner;

public class Lab103 {

    public static void main(String[] args) {
        // Program to check
        // if a number is Positive
        // Negative
        // or Zero

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("its a positive number");
        } else if(num < 0) {
            System.out.println("its a Negative number");
        }
        else{
            System.out.println("zero");
        }
    }
}
