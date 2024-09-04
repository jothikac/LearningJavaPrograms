package ex_27072024;

public class Lab142 {
    public static void main(String[] args) {
         int[] ages = new int[4]; // length is fixed not a value
        //  for non-primitive it does not matter if we provide final keyword or not we cant change anyway

        ages[3] = 78;
        System.out.println(ages[3]);


        final int a = 10;
       // a = 90;


    }
}
