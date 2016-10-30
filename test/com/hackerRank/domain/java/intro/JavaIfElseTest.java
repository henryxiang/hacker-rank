package com.hackerRank.domain.java.intro;

import com.hackerRank.BasicTest;
import org.junit.Test;

public class JavaIfElseTest extends BasicTest {
    private static final String[] inputFiles = {"JavaIfElseTest-input1.txt", "JavaIfElseTest-input2.txt"};
    private static final String[] outputFiles = {"JavaIfElseTest-output1.txt", "JavaIfElseTest-output2.txt"};

    @Test
    public void test() throws Exception {
        super.setProblemSolution(new JavaIfElseProblem());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }
}
