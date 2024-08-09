package HomeWork;

import java.util.Scanner;

public class HW001 {
    public static void main(String[] args) {
        // Triangle Classifier

        // 1. get the input from user
        // 2. logic building ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side1 : ");
        int Side1 = sc.nextInt();

        System.out.println("Enter Side2 : ");
        int Side2 = sc.nextInt();

        System.out.println("Enter Side3 : ");
        int Side3 = sc.nextInt();

        if(Side1 == Side2 && Side1 == Side3){
            System.out.println("All side are equal");
        }
        else if(Side1 == Side2 || Side1 == Side3 || Side2 == Side3)
        {
            System.out.println("Exactly 2 sides are equal");
        }
        else{
            System.out.println("No sides are equal");
        }

    }
}
