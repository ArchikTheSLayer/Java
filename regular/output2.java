package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class output2 {
    public void findFirstStr(String a, String str) throws Exception{

            Pattern pattern = Pattern.compile(str);
            Matcher matcher;

            ArrayList<String> lines = new ArrayList<>();
            Scanner in = new Scanner(new File("input1.html"));
            while (in.hasNextLine()) {
                lines.add(in.nextLine());
            }

            int col = -2;
            boolean find = false;
            for (int i = 0; i < lines.size(); i++) {
                matcher = pattern.matcher(lines.get(i).toLowerCase());
                if (matcher.find()) {
                    col = i;
                    find = true;
                    break;
                }
            }
            if (!find) {
                FileWriter fw = new FileWriter("output2.out");
                String s = Integer.toString(-1);
                fw.write(s);
                fw.close();
            } else {
                FileWriter fw = new FileWriter("output2.out");
                String s = Integer.toString(col);
                fw.write(s);
                fw.close();
            }

    }
}
