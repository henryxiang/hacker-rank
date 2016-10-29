package com.hackerRank.domain.tutorials.thirtyDaysOfCode;


import com.hackerRank.BasicTest;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

public class Day00Test extends BasicTest {

    @Test
    public void test1() throws Exception {
        String expectedOutput = IOUtils.toString(this.getClass().getResourceAsStream("output1.txt"));

        System.setIn(this.getClass().getResourceAsStream("input1.txt"));
        Day00 problem = new Day00();
        problem.solve();

        String result = outputStream.toString();

        Assert.assertNotNull("Null String", result);
        Assert.assertEquals("Wrong output", expectedOutput, result);
    }

}
