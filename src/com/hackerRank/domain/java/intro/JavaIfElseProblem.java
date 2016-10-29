package com.hackerRank.domain.java.intro;

import java.util.Scanner;

public class JavaIfElseProblem {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(checkNumber(n));
        scanner.close();
    }

    private String checkNumber(int n) {
        String result = "";
        if (n%2 != 0 || n%2 == 0 && n >= 6 && n <= 20) {
            result = "Weird";
        }
        else if (n%2 == 0 && (n >=2 && n <= 5 || n > 20)) {
            result = "Not Weird";
        }
        return result;
    }
}
