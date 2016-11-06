package com.hackerRank.domain.java.intro;

import com.hackerRank.BasicTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aaron on 11/5/16.
 */
public class JavaCurrencyFormatterTest extends BasicTest {
    private static final String[] inputFiles = {"JavaCurrencyFormatterTest-input1.txt"};
    private static final String[] outputFiles = {"JavaCurencyFormatterTest-output1.txt"};

    @Test(timeout = 3000)
    public void test() throws Exception {
        super.setProblemSolution(new JavaCurrencyFormatter());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }
}