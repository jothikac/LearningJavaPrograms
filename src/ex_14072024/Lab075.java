package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("jothika");
        String s2 = new String("jothika");
        String s3 = new String("jothika");

        System.out.println(s1==s2); // check for the ref
        System.out.println(s2==s3); // check for the ref
        System.out.println(s1.equals (s3));// check for the content


    }

}
