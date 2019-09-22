package Main;

import Sequence.Sequence;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Input number of rows: ");
            int row = in.nextInt();
            System.out.println("Input the number of columns: ");
            int col = in.nextInt();
            Integer[][] arr = new Integer[row][col];
            Sequence seq = new Sequence();
            seq.create_matrix(row, col, arr);
            seq.show_matrix(row, col, arr);
            seq.find_column(row, col, arr);
        }catch (Throwable ex) {
            System.out.print("Invalid input!");
        }

    }
}
