package com.hackerRank.domain.tutorials.thirtyDaysOfCode;


import com.hackerRank.domain.ProblemSolution;

import java.util.Scanner;

public class Day00 implements ProblemSolution {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Hello, World.");
        System.out.println(line);
        scanner.close();
    }
}
