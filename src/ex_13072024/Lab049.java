package ex_13072024;

public class Lab049 {
    public static void main(String[] args) {

        int a = 12;
        boolean b = !(a > 10 || a < 5); //false
        // ( 12 > 10 || 12 < 5)
        //     true || false - true -- o/p -> false

        //BODMAS - brackets, of, division, multiplication,
        // addition and subtraction

        System.out.println(b);

    }
}
