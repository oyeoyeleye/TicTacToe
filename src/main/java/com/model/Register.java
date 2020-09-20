package com.model;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Register {

    static int id1;
    static int id2;
    static String name1;
    static String name2;
    
    public void setid1(int id1) {
        Register.id1 = id1;
    }

    public void setName1(String name1) {
        Register.name1 = name1;
    }

    public void setid2(int id2) {
        Register.id2 = id2;
    }

    public void setName2(String name2) {
        Register.name2 = name2;
    }
    
    public static void print() {

        File file = new File("Register.txt");
        try {
            file.createNewFile();
            PrintStream writer = new PrintStream(file);
            writer.println("What is your number: " + id1);
            writer.println("Player X name: " + name1);
            writer.println("What is your number: " + id2);
            writer.println("Player X name: " + name2);
            writer.close();
        } catch (IOException e1) {
            System.err.println("Error creating file");
        }
	}
}