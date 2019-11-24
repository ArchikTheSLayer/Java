package com.company;

import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class output3 {
    public void notFind(String a, String str){
        try {
            a = a.toLowerCase();
            String replace = a.replaceAll(str, "");
            FileOutputStream os1 = new FileOutputStream("output3.out");
            byte[] strToBytes = replace.getBytes();
            os1.write(strToBytes);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
