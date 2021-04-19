package com.salah.introtodesignpatterns.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IODecoratorExample {
    public static void main(String[] args) throws IOException {

        /*
         * InputStream: abstract component
         * FileInputStream: concrete component
         * FilterInputStream: abstract decorator
         * DataInputStream: concrete decorator
         *
         */

        //InputStream inputStream = new FileInputStream("test.txt");
        //inputStream = new DataInputStream(System.in);

        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("src/resources/test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
