package Calculations;

import java.util.Scanner;

public class Calculations {

    private static Scanner in = new Scanner(System.in);
    public double calculate(){

        System.out.println("Input x: ");
        double x = in.nextDouble();


        System.out.println("Input k:");
        int k = in.nextInt();

        double e = Math.pow(10,-1 * k);
        int sum = 0;

        int i = 0;
        double current_num = current_num(x, i);
        while (e < Math.abs(current_num)){
            if(i % 2 ==0){
                sum-=current_num;
            }
            else {
                sum+=current_num;
            }
            current_num = current_num(x, ++i);
        }

        return sum;
    }

    private static double current_num(double x, int n)
    {
        return Math.pow(x,n)/n;
    }
}


