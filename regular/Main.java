package com.company;


import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        try {
            String a = new String(Files.readAllBytes(Paths.get("input1.html")));
            String str = new String(Files.readAllBytes(Paths.get("input2.in")));

            output1 op1 = new output1();
            op1.findTags(a);
            output2 op2 = new output2();
            op2.findFirstStr(a, str);
            output3 op3 = new output3();
            op3.notFind(a, str);
        }
        catch (Exception e){

        }
    }



}
