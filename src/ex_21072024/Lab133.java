package ex_21072024;

import java.util.Scanner;

public class Lab133 {
    public static void main(String[] args) {

        // FizzBuzz Problem:
        // Write a program that prints numbers from 1 to 100,
        // However, for multiples of 3, print "Fizz" instead of the number
        // and for Multiples of 5 print "buzz".
        // for numbers that are multiplies of both 3 and 5
        // print "fizzBuzz".


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Max number : ");
        int n = sc.nextInt();


        for(int i=1; i<=n;i++){
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i%3 == 0){
                System.out.println("Fizz");
            } else if(i%5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }


    }
    
}
