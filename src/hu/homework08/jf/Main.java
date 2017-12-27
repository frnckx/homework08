package hu.homework08.jf;

import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {


        FileOperation.fileMaker("C:\\Users\\Admin\\Desktop\\", 5, "teszt", "txt");
        FileOperation.fileMakerWithContent("C:\\Users\\Admin\\Desktop\\", "four", 3, "txt", "Hello");
        int[][] mtx = {{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        FileOperation.printMatrixIntoFile(mtx);
    }
}
