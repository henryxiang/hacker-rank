
package com.hackerRank.domain.java.intro;

import com.hackerRank.BasicTest;
import org.junit.Test;

public class DummyProblemTest extends BasicTest {
    private static final String[] inputFiles = {"DummyProblemTest-input1.txt"};
    private static final String[] outputFiles = {"DummyProblemTest-output1.txt"};

    @Test
    public void test() throws Exception {
        super.setProblemSolution(new DummyProblem());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }

}
