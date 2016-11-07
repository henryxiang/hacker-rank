#!/usr/bin/env python

import sys
import os
import re

if len(sys.argv) != 3:
    print("Error: Invalid arguments\n  %s className directory" % (sys.argv[0]))
    sys.exit()

baseDir = os.path.dirname(sys.argv[0]) + '/..'
className = sys.argv[1]
directory = sys.argv[2]

javaPackage = re.sub(r"^.*src/", '', directory).replace('/', '.')
testDirectory = directory.replace('src', 'test')
javaSrcFile = baseDir + '/' + directory + '/' + className + '.java'
javaTestFile = baseDir + '/' + testDirectory + '/' + className + 'Test.java'
testInputFile = baseDir + '/' + testDirectory + '/' + className + 'Test-input1.txt'
testOutputFile = baseDir + '/' + testDirectory + '/' + className + 'Test-output1.txt'


javaClassTemplate = \
'''
package {1};

import com.hackerRank.domain.ProblemSolution;
import java.util.*;

public class {0} implements ProblemSolution {{

    @Override
    public void solve() {{
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
        scanner.close();
    }}
}}
'''

javaTestTemplate = \
'''
package {1};

import com.hackerRank.BasicTest;
import org.junit.Test;

public class {0}Test extends BasicTest {{
    private static final String[] inputFiles = {{"{0}Test-input1.txt"}};
    private static final String[] outputFiles = {{"{0}Test-output1.txt"}};

    @Test
    public void test() throws Exception {{
        super.setProblemSolution(new {0}());
        super.setInputFiles(inputFiles);
        super.setOutputFiles(outputFiles);
        super.test();
    }}

}}
'''

print("Writeing Java source file:\n" + javaSrcFile)
output = open(javaSrcFile, 'w')
output.write(javaClassTemplate.format(className, javaPackage))
output.close()

print("Writing Java test file:\n" + javaTestFile)
output = open(javaTestFile, 'w')
output.write(javaTestTemplate.format(className, javaPackage))
output.close()

print("Writing test input file:\n" + testInputFile)
output = open(testInputFile, 'w')
output.write("TEST\n")
output.close()

print("Writing test output file:\n" + testOutputFile)
output = open(testOutputFile, 'w')
output.write("TEST\n")
output.close()
