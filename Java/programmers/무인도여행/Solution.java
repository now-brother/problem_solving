package java.programmers.무인도여행;

import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        
        boolean[][] visited = new boolean[n][m];
        ArrayList<Integer> ans = new ArrayList<>();
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && maps[i].charAt(j) != 'X') {
                    int sum = 0;
                    
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                    
                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        int x = cur[0], y = cur[1];
                        
                        sum += maps[x].charAt(y) - '0';
                        
                        for (int d = 0; d < 4; d++) {
                            int nx = x + dx[d];
                            int ny = y + dy[d];
                            
                            if (nx >= 0 && nx < n && ny >= 0 && ny < m 
                                && !visited[nx][ny] && maps[nx].charAt(ny) != 'X') {
                                visited[nx][ny] = true;
                                q.add(new int[]{nx, ny});
                            }
                        }
                    }
                    
                    ans.add(sum);
                }
            }
        }
        
        if (ans.isEmpty()) {
            return new int[]{-1};
        }
        
        Collections.sort(ans);
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
