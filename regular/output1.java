package com.company;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class output1 {

    public void findTags(String a){
        try {
            ArrayList<String> list = new ArrayList<>();
            Pattern pattern = Pattern.compile("<p>|</p>|<br>");
            Matcher matcher = pattern.matcher(a);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                list.add(a.substring(start, end) + " ");
            }
            Collections.sort(list);
            FileOutputStream os = new FileOutputStream("output1.out");
            for (String x : list) {
                byte[] strToBytes = x.getBytes();
                os.write(strToBytes);
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
