package ex_21072024;

public class Lab135 {
    public static void main(String[] args) {

        // Functions -
        // Block of code which we can reuse.
        // 1. Pre-Build - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        //Methods are used in diff classes

        // 2. Call the function
        for (int i = 0; i < 5; i++) {
            greet();
        }


        greet2();
    }

    // 1. Define
    static void greet() { // Void means No RETURN
        System.out.println("Hi, How are you?");
    }

    static void greet2() { // Void means No RETURN
        System.out.println("greet2");
    }
}
