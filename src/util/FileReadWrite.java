package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
    public static void writeFile(String fileName, String message) {
        try {
            FileWriter fileWriter = new FileWriter("text.xml",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void readFile(String fileName) {

        try {
            FileReader fileReader = new FileReader("text.xml");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
