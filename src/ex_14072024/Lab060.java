package ex_14072024;

import java.sql.SQLOutput;

public class Lab060 {
    public static void main(String[] args) {
        // Increment (++) / Decrement ( --) Operators
        // Pre and Post

        // pre - increment
        // value is incremented first and then stored in the result

       /* int a = 10;
        int b = ++a; // a = a+1
        // Exp = 11 , a = 11
        System.out.println(a);
        System.out.println(b);*/

        // Pre

        int a = 10;
        System.out.println(++a);
        // Exp = 11 , a = 11

        // POST
        // value is stored first in the result and incremented later
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        // Exp = 10 , a = 11

    }
}
