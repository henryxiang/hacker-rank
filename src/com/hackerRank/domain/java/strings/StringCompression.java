package com.hackerRank.domain.java.strings;

import com.hackerRank.domain.ProblemSolution;

import java.util.Scanner;

/**
 * Created by henry on 11/6/16.
 */
public class StringCompression implements ProblemSolution {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(stringCompress(input));
        }
    }

    private String stringCompress(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toCharArray();
        char current = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != current) {
                stringBuilder.append(current);
                if (count > 1) stringBuilder.append(count);
                current = chars[i];
                count = 1;
            }
            else {
                count += 1;
            }
        }
        stringBuilder.append(current);
        if (count > 1) stringBuilder.append(count);
        return stringBuilder.toString();
    }
}
