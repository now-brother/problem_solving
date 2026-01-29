package java.programmers.게임맵최단거리;

import java.util.*;

class Solution {

    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    private static class Node {
        int y, x;
        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public int solution(int[][] maps) {
        int h = maps.length;
        int w = maps[0].length;

        int[][] check = new int[h][w];
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(0, 0));
        check[0][0] = 1;

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int ny = cur.y + dy[i];
                int nx = cur.x + dx[i];

                if (ny < 0 || ny >= h || nx < 0 || nx >= w) continue;
                if (maps[ny][nx] == 0) continue;

                if (check[ny][nx] == 0) {
                    check[ny][nx] = check[cur.y][cur.x] + 1;
                    queue.add(new Node(ny, nx));
                }
            }
        }

        return check[h - 1][w - 1] == 0 ? -1 : check[h - 1][w - 1];
    }
}