package io;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yeyulong on 2017/4/6.
 */
public class TestPrintWriter {
    public static void main(String [] argvs) {
        String filename = "test.txt";

        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter(filename, false);
            pw = new PrintWriter(fw);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return ;
        } catch (IOException e) {
            e.printStackTrace();
            return ;
        }

        for (int i = 0; i < 10; i++) {
            pw.println("Line " + i);
        }

        pw.flush();
        pw.close();
    }
}
