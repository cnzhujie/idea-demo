package com.example;

import java.io.File;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        System.out.println(222);
        System.out.println(111111111);
        
        try {
            new FileOutputStream(new File("/a.txt"));
        }catch (Throwable e) {
            System.out.println(111);
        }
    }
}
