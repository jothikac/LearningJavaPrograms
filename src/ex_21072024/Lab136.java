package ex_21072024;

public class Lab136 {
    public static void main(String[] args) {
        // Functions -
        // Block of code which we can reuse.
        // 1. Pre-Build - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        // 1. without Parameters and without return Type
        // 2. without Parameters and with return Type
        // 3. with Parameters and without return Type  // main method
        // 4. with Parameters and with return Type



        function_type1();

        System.out.println("----------");

        String name = function_type2();
        System.out.println(name);

        System.out.println("-----------");

        function_type3("Muruga");
        function_type3("123");

        System.out.println("-----------");

        int sum_result = function_type4(4,5);
        System.out.println("O/P -> "+sum_result);


    }
    // 1. without Parameters and without return Type

    static void function_type1(){
        System.out.println("1. without Parameters and without return ");
    }
    // 2. without Parameters and with return Type
    static String function_type2(){
        System.out.println("2. without Parameters and with return Type");
        return "Jothika";
    }
    // 3. with Parameters and without return Type
    static void function_type3(String name){
        System.out.println("3. with Parameters and without return Type\n");
        System.out.println("You have shared ->" +name);
    }
    // 4. with Parameters and with return Type
    static int function_type4(int a, int b){
        System.out.println("4. with Parameters and with return Type");
        return a+b;
    }

}
