package Java.programmers.지형이동;

import java.util.*;

class Solution {
    
    private static class Node {
        int y, x, cost;

        public Node(int y, int x, int cost) {
            this.y = y;
            this.x = x;
            this.cost = cost;
        }
    }

    public int solution(int[][] land, int height) {
        int n = land.length;
        boolean[][] visited = new boolean[n][n];
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.add(new Node(0, 0, 0));
        int totalCost = 0;

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (visited[cur.y][cur.x]) continue;
            visited[cur.y][cur.x] = true;
            totalCost += cur.cost;

            for (int i = 0; i < 4; i++) {
                int ny = cur.y + dy[i];
                int nx = cur.x + dx[i];

                if (ny < 0 || ny >= n || nx < 0 || nx >= n) continue;
                if (visited[ny][nx]) continue;

                int diff = Math.abs(land[cur.y][cur.x] - land[ny][nx]);
                int cost = diff > height ? diff : 0;
                pq.add(new Node(ny, nx, cost));
            }
        }

        return totalCost;
    }
}
