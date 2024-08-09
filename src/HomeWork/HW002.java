package HomeWork;

import java.util.Scanner;

public class HW002 {
    public static void main(String[] args) {
        // Leap Year

        // 2016/4 == 0 - Leap Year
        // 2014/4 == 2 -> not a leap year
      int year = 2024;
        if(year % 4 ==0)
        {
            System.out.println("Its a Leap Year");
        }
        else{
            System.out.println("its not a leap year");
        }

/*
getting the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");

        int year = sc.nextInt();

        // year % 400 == 0 - it's a leap
        // year % 4 == 0 && year % 100 == 0 - its a leap year

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not");
        }
*/


    }
}
