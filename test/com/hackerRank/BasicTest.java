package com.hackerRank;

import com.hackerRank.domain.ProblemSolution;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.BeforeClass;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BasicTest {
    protected static ByteArrayOutputStream outputStream;
    protected static PrintStream stdout;
    protected static PrintStream redirectOut;

    private ProblemSolution solution;
    private String[] inputFiles;
    private String[] outputFiles;

    @BeforeClass
    public static void setup() {
        outputStream = new ByteArrayOutputStream();
        stdout = System.out;
        redirectOut = new PrintStream(outputStream);
        System.setOut(redirectOut);
    }

    public void setProblemSolution(ProblemSolution solution) {
        this.solution = solution;
    }

    public void setInputFiles(String[] files) {
        this.inputFiles = files;
    }

    public void setOutputFiles(String[] files) {
        this.outputFiles = files;
    }

    public void test() throws Exception {
        for (int i = 0; i < inputFiles.length; i++) {
            System.err.println("Test Case " + (i+1));

            String inputFile = String.format(inputFiles[i]);
            String resultFile = String.format(outputFiles[i]);
            String input = IOUtils.toString(this.getClass().getResourceAsStream(inputFile));
            String expectedOutput = IOUtils.toString(this.getClass().getResourceAsStream(resultFile));

            System.setIn(this.getClass().getResourceAsStream(inputFile));
            solution.solve();

            String result = outputStream.toString();

            System.err.println("Input:\n" + input);
            System.err.println("Result:\n" + result);

            Assert.assertNotNull("Null String", result);
            Assert.assertEquals("Wrong output", expectedOutput, result);

            outputStream.reset();
        }
    }
}
