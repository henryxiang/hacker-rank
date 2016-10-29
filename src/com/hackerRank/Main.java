package com.hackerRank;

import com.hackerRank.domain.tutorials.thirtyDaysOfCode.Day00;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Hacker!");
        test1();
    }

    public static void test1() {
        Day00 s = new Day00();
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        PrintStream out = new PrintStream(outputStream);
        System.setOut(out);
        s.solve();
        String output = outputStream.toString();
        System.setOut(stdout);
        System.out.println(output);
    }
}
