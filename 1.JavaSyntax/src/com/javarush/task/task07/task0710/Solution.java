package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        Reader in =new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(in);

        ArrayList<String> strmass=new ArrayList();
        for (int i = 0; i <10 ; i++) {
            strmass.add(0,bufferedReader.readLine());
        }
        for (String elem:strmass
             ) {
            System.out.println(elem);
        }

    }
}
