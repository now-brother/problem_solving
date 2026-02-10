package java.programmers.level2.피로도;

class Solution {
    
    private static int[][] dungeon;
    private static boolean[] visited;
    private static int answer;
    
    private static void backtracking(int k, int cnt){
        for(int i = 0; i < dungeon.length; i++){
            if(!visited[i] && k >= dungeon[i][0]){
                visited[i] = true;
                int nk = k - dungeon[i][1];
                backtracking(nk, cnt + 1);
                answer = Math.max(answer, cnt + 1);
                visited[i] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        dungeon = dungeons;
        visited = new boolean[dungeons.length];
        
        backtracking(k, 0);
        
        return answer;
    }
}