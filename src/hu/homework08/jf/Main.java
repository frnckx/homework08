package hu.homework08.jf;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {


        FileOperation.fileMaker("C:\\Users\\Admin\\Desktop\\", 5, "teszt", "txt");
        FileOperation.fileMakerWithContent( "C:\\Users\\Admin\\Desktop\\", "three","txt", "Hello");
    }
}
