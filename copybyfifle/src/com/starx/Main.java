package com.starx;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static int count = 0;
    static ArrayList<String> list = new ArrayList<>();
    static File file1 = new File("mau.txt");
    static File file2 = new File("copy.txt");

    public static void docFile(String filePath) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
                count++;
            }
            bufferedReader.close();
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String filePath) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            for (String a : list) {
                bufferedWriter.write(a);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        docFile("mau.txt");
        writeFile("copy.txt");
        for (String a: list){
            System.out.println(a);
        }
    }
}
