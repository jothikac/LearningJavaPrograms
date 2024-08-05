package ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        String name = "Monisha";

        // String? - // Bunch of Chars - Collection of Chars
        //Class - ?

        String name2 = new String ("Monisha");
        // How many ways we can a string - 2
        // = (Normal Operator) , new operator
        // = "SCP" - String Constant Pool
        // new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10)); // Exception Index 10 out of bounds



    }
}
