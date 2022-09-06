package yndx.kvv;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final String inputFile = "input.txt";
    private static final String outputFile = "output.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String name = reader.readLine();
        List<String> strB = Arrays.stream(reader.readLine().split("")).collect(Collectors.toList());
        reader.close();

        StringBuilder a = new StringBuilder(name);
        List<String> strA = Arrays.stream(name.split("")).collect(Collectors.toList());

        int i = 0;

        for (Iterator<String> it = strB.listIterator(); it.hasNext();i++) {
            String b = it.next();
            if (b.equals(strA.get(i))) {
                strA.set(i, "*");
                strB.set(i, "-");
                a.setCharAt(i, 'P');
            }
        }

        i = 0;

        for (Iterator<String> it = strB.listIterator(); it.hasNext();i++){
            String b = it.next();
            if (b.equals("-")) continue;

            int num = strA.indexOf(b);
            if (num == -1){
                a.setCharAt(i,'I');
            }
            else{
                strA.set(num,"*");
                a.setCharAt(i,'S');
            }
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        writer.write(a.substring(0));
        writer.close();
    }
}