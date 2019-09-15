package Screen;

import java.util.Scanner;

public class Screen {
    public void choise(){
        String num;
        do{
            display();
            Scanner in = new Scanner(System.in);
            num = in.nextLine();
            switch (num){
                case "1":
                    System.out.println("Input number:");
                    int num1 = in.nextInt();
                    int fact = 1;
                    for(int i = num1; i > 0; i--){
                        fact = fact * i;
                    }
                    System.out.println(fact);
                    break;
                case "2":
                    System.out.println("Input string:");
                    String str = in.nextLine();
                    String str1 =  new StringBuffer(str).reverse().toString();
                    System.out.print(str1 + "\n");
                    break;
                case "3":
                    System.out.println("Input string:");
                    String all_str = in.nextLine();
                    System.out.println("Input substring:");
                    String fing_str = in.nextLine();
                    boolean isContain = all_str.contains(fing_str);
                    System.out.println(isContain);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Invalid input! Try again.");
                    break;
            }
        }while (!num.equals("0"));
    }

    public static void display()
    {
        System.out.println("0. Exit");
        System.out.println("1. Factorial");
        System.out.println("2. Reverse string");
        System.out.println("3. Find substring");
        System.out.println("Input your choise:");
    }

}
