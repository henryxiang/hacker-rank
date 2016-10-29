package com.hackerRank;

import org.junit.BeforeClass;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BasicTest {
    protected static ByteArrayOutputStream outputStream;
    protected static PrintStream stdout;
    protected static PrintStream redirectOut;

    @BeforeClass
    public static void setup() {
        outputStream = new ByteArrayOutputStream();
        stdout = System.out;
        redirectOut = new PrintStream(outputStream);
        System.setOut(redirectOut);
    }
}
