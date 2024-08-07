package ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        // JDK > 13

        int code = 2;

        switch (code){
            case 001,002,003:
                System.out.println("It is Electronic Gadget");
                break;
            case 004,005,007:
                System.out.println("its a Mechanical");
                break;
            default:
                System.out.println("None");

        }

    }
}
