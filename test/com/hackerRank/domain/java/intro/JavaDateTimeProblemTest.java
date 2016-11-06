package com.hackerRank.domain.java.intro;

import com.hackerRank.BasicTest;
import com.hackerRank.domain.java.strings.JavaRegexProblem;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aaron on 11/5/16.
 */
public class JavaDateTimeProblemTest extends BasicTest{
    private static final String[] inputFiles = {"JavaDateTimeTest-input1.txt"};
    private static final String[] outputFiles = {"JavaDateTimeTest-output1.txt"};

    @Test(timeout = 3000)
    public void test() throws Exception {
        super.setProblemSolution(new JavaDateTimeProblem());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }

}