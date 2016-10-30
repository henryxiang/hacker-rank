package com.hackerRank.domain.tutorials.thirtyDaysOfCode;


import com.hackerRank.BasicTest;
import org.junit.Test;

public class Day00Test extends BasicTest {
    private static final String[] inputFiles = {"input1.txt"};
    private static final String[] outputFiles = {"output1.txt"};

    @Test
    public void test() throws Exception {
        super.setProblemSolution(new Day00());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }

}
