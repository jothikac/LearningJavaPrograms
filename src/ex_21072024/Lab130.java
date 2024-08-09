package ex_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        // coding program
        // Factorial Program

        // n = 5 -> fact =  5*4*3*2*1 = 120
        // n = 4 -> fact =  4*3*2*1 = 24
        // n = 3 -> fact =  3*2*1 = 6
        // n = 2 -> fact =  2*1 = 2
        // n =  -> fact =  1*1 = 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");

        int num = sc.nextInt();

        int fact = 1;
        for(int i=1; i <= num; i++){
           fact = fact * i ;
        }

        System.out.println(fact);

       /* int i = 1;
        while(i<=num){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
        */
        sc.close();

    }
}
