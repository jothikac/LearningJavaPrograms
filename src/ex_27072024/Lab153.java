package ex_27072024;

public class Lab153 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("jothika");
        System.out.println(stringBuilder.reverse().toString());

        // StringBuilder is faster and more efficient in single threaded environments
        // Stringbuffer is safer to use in multi-threaded environments - slower


    }
}
