package ex_20072024;

import java.util.Scanner;

public class Lab092 {

    public static void main(String[] args) {

        // If else - condition (If, else if, else) - multiple condition

        // Switch - better way for 2+ condition
        // which day it is - day - 1 to 7
        // 3 - wed

        // MTWTFSS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, Tell what day it is");
        int day=sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("satur");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
      }

        System.out.println("Outside the Switch ");
    }
    }
