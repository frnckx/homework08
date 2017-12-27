package hu.homework08.jf;

import java.io.*;

public class FileOperation {

    public static void fileMaker(String location, int num, String fileName, String extension) {
        try {
            for (int i = 1; i <= num; i++) {
                FileOutputStream fout = new FileOutputStream(location + fileName + i + "." + extension);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {

            System.out.println(e);
        }

    }

    public static void fileMakerWithContent(String location, String fileName, int num, String extension, String content) {
        try {
            for (int i = 1; i <= num; i++) {


                FileOutputStream fout = new FileOutputStream(location + fileName + i + "." + extension);
                BufferedOutputStream bout = new BufferedOutputStream(fout);
                byte b[] = content.getBytes();
                bout.write(b);
                bout.flush();
                bout.close();
                fout.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {

            System.out.println(e);
        }


    }

    public static void printMatrixIntoFile(int[][] mtx) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\five.txt");
            BufferedWriter buffer = new BufferedWriter(writer);

            for (int i = 0; i < mtx.length; i++) {
                for (int j = 0; j < mtx[i].length; j++) {
                    if (j == mtx[i].length - 1) {
                        buffer.write(mtx[i][j] + "");
                    } else {
                        buffer.write(mtx[i][j] + " ");
                    }
                }
                buffer.newLine();
            }
            buffer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
