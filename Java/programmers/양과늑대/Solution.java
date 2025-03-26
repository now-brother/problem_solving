package Java.programmers.양과늑대;

import java.util.*;

class Solution {
    int maxSheep = 0;
    List<Integer>[] tree;

    @SuppressWarnings("unchecked")
    public int solution(int[] info, int[][] edges) {
        int n = info.length;
        tree = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int from = edge[0], to = edge[1];
            tree[from].add(to);
        }

        List<Integer> next = new ArrayList<>();
        next.add(0);
        dfs(0, 0, 0, next, info);

        return maxSheep;
    }

    private void dfs(int node, int sheep, int wolf, List<Integer> canGo, int[] info) {
        if (info[node] == 0) sheep++;
        else wolf++;

        if (wolf >= sheep) return;

        maxSheep = Math.max(maxSheep, sheep);

        List<Integer> next = new ArrayList<>(canGo);
        next.remove(Integer.valueOf(node));
        next.addAll(tree[node]);

        for (int nextNode : next) {
            dfs(nextNode, sheep, wolf, next, info);
        }
    }
}

