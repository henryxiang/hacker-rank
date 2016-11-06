package com.hackerRank.domain.java.strings;

import com.hackerRank.BasicTest;
import org.junit.Test;

/**
 * Created by henry on 11/6/16.
 */
public class StringCompressionTest extends BasicTest {
    private static final String[] inputFiles = {"StringCompressionTest-input1.txt"};
    private static final String[] outputFiles = {"StringCompressionTest-output1.txt"};

    @Test
    public void solve() throws Exception {
        super.setProblemSolution(new StringCompression());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }

}