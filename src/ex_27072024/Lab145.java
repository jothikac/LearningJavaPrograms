package ex_27072024;

public class Lab145 {
    public static void main(String[] args) {

        //(String[] args) -> with parameter and without return type

      /*  System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args.length);
        */

        if(args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(i +"->"+args[i]);

            }
        }
            else{
                System.out.println("No Arguments given");
            }
        }
    }

