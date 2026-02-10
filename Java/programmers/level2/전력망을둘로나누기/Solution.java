package java.programmers.level2.전력망을둘로나누기;

class Solution {

    private static boolean[][] graph;
    private static boolean[] visited;
    private static int cnt;

    private static void dfs(int node, int n) {
        visited[node] = true;
        cnt++;
        for (int i = 0; i < n; i++) {
            if (graph[node][i] && !visited[i]) {
                dfs(i, n);
            }
        }
    }

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int cut = 0; cut < wires.length; cut++) {
            graph = new boolean[n][n];

            for (int i = 0; i < wires.length; i++) {
                if (i == cut) continue;
                int a = wires[i][0] - 1;
                int b = wires[i][1] - 1;
                graph[a][b] = graph[b][a] = true;
            }

            visited = new boolean[n];
            cnt = 0;

            dfs(0, n);

            int diff = Math.abs((n - cnt) - cnt);
            answer = Math.min(answer, diff);
        }

        return answer;
    }
}
