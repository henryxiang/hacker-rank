package com.hackerRank.domain.java.strings;

import com.hackerRank.BasicTest;
import org.junit.Test;

public class JavaRegexTest extends BasicTest {
    private static final String[] inputFiles = {"JavaRegexTest-input1.txt"};
    private static final String[] outputFiles = {"JavaRegexTest-output1.txt"};

    @Test
    public void test() throws Exception {
        super.setProblemSolution(new JavaRegexProblem());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }
}
