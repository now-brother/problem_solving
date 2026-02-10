package java.programmers.level3.네트워크;

class Solution {
    private static int[][] computer;
    private static boolean[] visited;
    
    private static void dfs(int n, int l){
        visited[n] = true;
        for(int i = 0; i < l; i++){
            if(computer[n][i] == 1 && !visited[i])
                dfs(i,l);
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        computer = computers;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i,n);
                answer++;
            }
        }
        return answer;
    }
}