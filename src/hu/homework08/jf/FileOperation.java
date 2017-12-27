package hu.homework08.jf;

import javax.xml.bind.SchemaOutputResolver;
import java.io.*;

public class FileOperation {

    public static void fileMaker(String location, String fileName) {
       // FileOutputStream fout = null;
        try {
          FileOutputStream  fout = new FileOutputStream(location + fileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){

            System.out.println(e);
        }

    }
}
