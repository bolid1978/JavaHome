package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter writer =  new StringWriter();
        if (is == null) {
            writer.write("");
            return writer;
        }
        byte[] mass = new byte[is.available()];
        is.read(mass);
        String str = new String(mass);
        writer.write(str);
        return writer;
    }
}
