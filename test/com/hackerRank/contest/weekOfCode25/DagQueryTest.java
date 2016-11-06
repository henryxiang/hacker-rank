package com.hackerRank.contest.weekOfCode25;

import com.hackerRank.BasicTest;
import org.junit.Test;

/**
 * Created by henry on 11/5/16.
 */
public class DagQueryTest extends BasicTest {
    private static final String[] inputFiles = {"DagQueryTest-input1.txt"};
    private static final String[] outputFiles = {"DagQueryTest-output1.txt"};

    @Test
    public void test() throws Exception {
        super.setProblemSolution(new DagQuery());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }

}