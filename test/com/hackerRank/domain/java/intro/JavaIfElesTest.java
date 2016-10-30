package com.hackerRank.domain.java.intro;

import com.hackerRank.BasicTest;
import org.junit.Test;

public class JavaIfElesTest extends BasicTest {
    private static final String[] inputFiles = {"input1.txt", "input2.txt"};
    private static final String[] outputFiles = {"output1.txt", "output2.txt"};

    @Test
    public void test() throws Exception {
        super.setProblemSolution(new JavaIfElseProblem());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }
}
