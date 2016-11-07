
package com.hackerRank.domain.java.intro;

import com.hackerRank.domain.ProblemSolution;
import java.util.*;

public class DummyProblem implements ProblemSolution {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
        scanner.close();
    }
}
