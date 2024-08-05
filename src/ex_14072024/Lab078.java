package ex_14072024;

public class Lab078 {
    public static void main(String[] args) {
        String password = "Jothika@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        //pass_u=password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Jothika@123 = jothika@123 = JOthika@123 = JothIka@123

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('o'));
        System.out.println(password.length());

    }
}
