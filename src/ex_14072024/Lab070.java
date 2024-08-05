package ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String  s1 = new String("Jothika");
        String  s2 = new String("Jothika");
        // 2 -> Heap Area
        String s3 = s1;
        // 2, heap s3 -> s1 => Jothika

    }
}
