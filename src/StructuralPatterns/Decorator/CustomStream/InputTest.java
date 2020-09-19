package StructuralPatterns.Decorator.CustomStream;

import java.io.*;

class InputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/Structural.Decorator/CustomStream/test.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
