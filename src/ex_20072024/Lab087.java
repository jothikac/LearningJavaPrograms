package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take a user input and check if the number is even or odd

        // Logic Building -
        // 1. Figure out the inputs
        // 2. Data type - int
        // how to take input in the java? - Scanner - class
        // nextInt() - >input


        // 3. Do we need conversion or directly
        // 4. Rough logic -> num%2==0 even,odd
        // 5. optimize

       Scanner sc = new Scanner(System.in); // creation of object of the scanner Class - OPPs
       System.out.println("Enter a number");
       int num = sc.nextInt();
       System.out.println(num);

       if(num%2==0){
           System.out.println("Even");
       } else{
           System.out.println("Odd");
       }
    }
}
