package ex_14072024;

import java.sql.SQLOutput;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP
        // String Constant Pool will always Keep unique one value

        String name2 = new String("The Testing Academy"); // Heap Area
//        String name3 = new String("The Test Academy"); // Heap Area
//
//        System.out.println(name == name1); // Check for the ref
//        System.out.println(name.equals(name1)); // Check for the content

        System.out.println(name1 == name2); // check for the ref
        System.out.println(name1.equals(name2)); // Check for the content

        // == -> this equal check for reference
        // equals - this equal check for content

    }
}
