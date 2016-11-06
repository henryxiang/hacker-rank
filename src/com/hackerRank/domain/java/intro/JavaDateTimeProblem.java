package com.hackerRank.domain.java.intro;

import com.hackerRank.domain.ProblemSolution;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;


/**
 * Created by aaron on 11/5/16.
 */
public class JavaDateTimeProblem  implements ProblemSolution {
    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.US).toUpperCase());
    }
}
