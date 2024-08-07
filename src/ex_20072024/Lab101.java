package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        // Write a program to get the name,age , salary form the user and print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String Name = sc.next();

        System.out.println("Enter your age: ");
        int Age = sc.nextInt();

        System.out.println("Enter your Salary: ");
        double Salary = sc.nextDouble();


        System.out.println("Name : "+Name);
        System.out.println("Age : "+Age);
        System.out.println("Salary : "+Salary);


    }
}

