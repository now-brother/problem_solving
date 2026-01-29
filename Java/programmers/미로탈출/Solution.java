package java.programmers.미로탈출;

import java.util.*;

class Solution {
    
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    
    private static class Node {
        int y, x, dist;
        public Node(int y, int x, int dist) {
            this.y = y;
            this.x = x;
            this.dist = dist;
        }
    }

    public int solution(String[] maps) {
        int h = maps.length;
        int w = maps[0].length();
        int sy = 0, sx = 0;
        int ey = 0, ex = 0;
        int ly = 0, lx = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                char c = maps[i].charAt(j);
                if (c == 'S') {
                    sy = i; sx = j;
                } else if (c == 'E') {
                    ey = i; ex = j;
                } else if (c == 'L') {
                    ly = i; lx = j;
                }
            }
        }

        int toLever = bfs(maps, sy, sx, 'L');
        if (toLever == -1) return -1;

        int toExit = bfs(maps, ly, lx, 'E');
        if (toExit == -1) return -1;

        return toLever + toExit;
    }

    private int bfs(String[] maps, int sy, int sx, char target) {
        int h = maps.length;
        int w = maps[0].length();
        boolean[][] visited = new boolean[h][w];

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(sy, sx, 0));
        visited[sy][sx] = true;

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            if (maps[cur.y].charAt(cur.x) == target) {
                return cur.dist;
            }

            for (int i = 0; i < 4; i++) {
                int ny = cur.y + dy[i];
                int nx = cur.x + dx[i];

                if (ny < 0 || ny >= h || nx < 0 || nx >= w) continue;
                if (maps[ny].charAt(nx) == 'X' || visited[ny][nx]) continue;

                visited[ny][nx] = true;
                queue.add(new Node(ny, nx, cur.dist + 1));
            }
        }

        return -1;
    }
}

