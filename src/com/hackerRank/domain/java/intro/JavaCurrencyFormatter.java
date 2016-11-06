package com.hackerRank.domain.java.intro;

import com.hackerRank.domain.ProblemSolution;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by aaron on 11/5/16.
 */
public class JavaCurrencyFormatter implements ProblemSolution {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();


        Locale india = new Locale("en", "IN");
        Locale[] locales = {Locale.US, india, Locale.CHINA, Locale.FRANCE};
        String[] countries = {"US", "India", "China", "France"};

        for (int i = 0; i < 4; i++) {
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locales[i]);
            System.out.printf("%s: %s\n", countries[i], numberFormat.format(number));
        }
    }
}
