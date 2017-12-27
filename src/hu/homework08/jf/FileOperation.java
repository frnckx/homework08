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

    public static void fileMakerWithContent(String location, String fileName,int num, String extension, String content){
        try {
            for (int i = 1; i <=num ; i++) {


                FileOutputStream fout = new FileOutputStream(location + fileName +i+ "." + extension);
                BufferedOutputStream bout = new BufferedOutputStream(fout);
                byte b[] = content.getBytes();
                bout.write(b);
                bout.flush();
                bout.close();
                fout.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){

            System.out.println(e);
        }


    }
}
