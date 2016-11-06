package com.hackerRank.contest.weekOfCode25;

import com.hackerRank.domain.ProblemSolution;

import java.util.*;

public class DagQuery implements ProblemSolution {

    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private BitSet visited;
    private int[] values;

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        int q = scanner.nextInt();

        visited = new BitSet(v+1);
        visited.clear();
        values = new int[v+1];

        for (int i = 0; i < e; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (!graph.containsKey(a)) {
                graph.put(a, new ArrayList<Integer>());
            }
            graph.get(a).add(b);
        }

        while (q-- > 0) {
            int cmd = scanner.nextInt();
            int a, b;
            switch (cmd) {
                case 1:
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    visited.clear();
                    setAll(a, b, visited);
                    break;
                case 2:
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    visited.clear();
                    setAllSmall(a, b, visited);
                    break;
                case 3:
                    a = scanner.nextInt();
                    System.out.println(values[a]);
                    break;
            }
        }
        scanner.close();
    }

    private void setAll (int u, int s, BitSet visited) {
        visited.set(u);
        values[u] = s;

        if (graph.containsKey(u)) {
            for (int n : graph.get(u)) {
                if (!visited.get(n)) setAll(n, s, visited);
            }
        }
    }

    private void setAllSmall (int u, int s, BitSet visited) {
        visited.set(u);
        if (values[u] > s) values[u] = s;

        if (graph.containsKey(u)) {
            for (int n : graph.get(u)) {
                if (!visited.get(n)) setAllSmall(n, s, visited);
            }
        }
    }
}
