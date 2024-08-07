package ex_20072024;

public class Lab086 {
    public static void main(String[] args) {
        // Modulus -> %
        // 10 % 2 -> 0
        // 2 | 10 | 5 --> quieten
        //   | 10 |
        //   | 0 | --> Remainder

        // 11%2 -> 1 ->remainder

        // find the given number is even or odd
        int num = 11;
        if(num%2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
