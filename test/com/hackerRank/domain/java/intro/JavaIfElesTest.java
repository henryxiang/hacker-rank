package com.hackerRank.domain.java.intro;

import com.hackerRank.BasicTest;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

public class JavaIfElesTest extends BasicTest {
    @Test
    public void test() throws Exception {
        int testCaseNumber = 2;

        for (int i = 1; i <= testCaseNumber; i++) {
            System.err.println("Test Case " + i);

            String inputFile = String.format("input%d.txt", i);
            String resultFile = String.format("output%d.txt", i);
            String input = IOUtils.toString(this.getClass().getResourceAsStream(inputFile));
            String expectedOutput = IOUtils.toString(this.getClass().getResourceAsStream(resultFile));

            System.setIn(this.getClass().getResourceAsStream(inputFile));
            JavaIfElseProblem problem = new JavaIfElseProblem();
            problem.solve();

            String result = outputStream.toString();

            System.err.println("Input:\n" + input);
            System.err.println("Result:\n" + result);

            Assert.assertNotNull("Null String", result);
            Assert.assertEquals("Wrong output", expectedOutput, result);

            outputStream.reset();
        }

    }
}
