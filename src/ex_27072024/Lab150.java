package ex_27072024;

public class Lab150 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {34, 1},
                {34, 2},
                {34, 3}
        };

        int row = array_2d.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
