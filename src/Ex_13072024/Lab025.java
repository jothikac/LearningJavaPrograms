package Ex_13072024;

public class Lab025 {
    public static void main(String[] args) {
        int a = 10;
        int b = 34;
        System.out.println(a+b);

        String s1 = "Jothika";
        String s2 = "C";
        System.out.println(s1+s2);

        String s3 = "Dog";
        int x = 99;
        int y = 100;
//        System.out.println(x+y);
//        System.out.println(x+s3);
//        System.out.println(s3+y);
//        System.out.println(x+y+s3);
//        System.out.println(s3+x+y);
//        System.out.println(x+s3+y);

        System.out.println(x+y+s3+y+s3+x+y);
        //199Dog100Dog99100

    }
}
