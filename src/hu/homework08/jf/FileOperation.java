package hu.homework08.jf;

import java.io.*;

public class FileOperation {

    public static void fileMaker(String location, int num, String fileName, String extension) {
        try {
            for (int i = 1; i <=num ; i++) {
                FileOutputStream  fout = new FileOutputStream(location + fileName+i+"."+ extension);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){

            System.out.println(e);
        }

    }
}
