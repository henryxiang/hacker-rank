package com.hackerRank.domain.java.strings;

import com.hackerRank.domain.ProblemSolution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexProblem implements ProblemSolution {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(isValidIP(s));
        }
    }

    private boolean isValidIP(String s) {
        String ipDigitGroup = "(2[0-5][0-5]|[01][0-9][0-9]|\\d{1,2})";
        String regex = String.format("\\b(%1$s\\.){3}%1$s\\b", ipDigitGroup);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
