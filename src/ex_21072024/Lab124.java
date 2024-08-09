package ex_21072024;

public class Lab124 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -->" + i);
                break; // continue is the important keyword
            }
            System.out.println("Odd --> " + i);
            // System.out.println(i);
        }
    }
    }

