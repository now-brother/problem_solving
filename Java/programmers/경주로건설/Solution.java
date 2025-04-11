import java.util.*;

class Solution {
    
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    
    private static class Node {
        int x, y, dir, cost;

        public Node(int x, int y, int dir, int cost) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.cost = cost;
        }
    }

    public int solution(int[][] board) {
        int N = board.length;
        int[][][] cost = new int[N][N][4];

        for (int[][] arr : cost) {
            for (int[] inner : arr) {
                Arrays.fill(inner, Integer.MAX_VALUE);
            }
        }

        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            cost[0][0][i] = 0;
            queue.add(new Node(0, 0, i, 0));
        }

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if (board[nx][ny] == 1) continue;

                int newCost = now.cost + (now.dir == i ? 100 : 600);

                if (cost[nx][ny][i] > newCost) {
                    cost[nx][ny][i] = newCost;
                    queue.add(new Node(nx, ny, i, newCost));
                }
            }
        }

        return Arrays.stream(cost[N - 1][N - 1]).min().getAsInt();
    }
}
