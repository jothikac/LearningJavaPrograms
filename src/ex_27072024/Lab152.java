package ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer

        String s1 = "Jothika";
        s1 = "Moni";



        StringBuffer stringBuffer = new StringBuffer("Jothika");
        // change the value of string - Buffer
        stringBuffer.append("Moni"); // JothikaMoni

        StringBuilder stringBuilder =new StringBuilder("Nisha");
        stringBuilder.append("Sarath");

        // Thread Safty?

        // stringBuilder - not thread safe - people love it :)




    }
}
