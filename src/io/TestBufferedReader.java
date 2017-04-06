package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yeyulong on 2017/4/6.
 */
public class TestBufferedReader {
    public static void main(String [] argvs) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        try {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return ;
        }

    }
}
