package ex_27072024;

public class Lab151 {
    public static void main(String[] args) {
        // String - Bunch of charactors

        String s1 = new String("Jothika"); // Stores in Heap Area
        String s2 = "Jothika"; // in String Constant pool

        // string - Immutable in nature

        System.out.println(s1.length());
        System.out.println(s1.indexOf("J"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}
