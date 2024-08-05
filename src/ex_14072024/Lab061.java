package ex_14072024;

public class Lab061 {
    public static void main(String[] args) {

        int a = 10;
        int result = a++;
        System.out.println(a); // a = 11
        System.out.println(result); // result = 10

        // Exp = 10 , a = 11


        int a_post = 10;
        int result1 = ++a_post;
        System.out.println(a_post); // 11
        System.out.println(result1); // 11

        // Exp = 11 , a = 11

    }
}
