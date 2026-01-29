package java.programmers.당구연습;

class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        
        for(int i = 0; i < balls.length; i++){
            int targetX = balls[i][0];
            int targetY = balls[i][1];
            
            int minD = Integer.MAX_VALUE;
            
            if (!(startY == targetY && startX > targetX)) { 
                int dx = startX - (-targetX);
                int dy = startY - targetY;
                minD = Math.min(minD, dx*dx + dy*dy);
            }
            
            if (!(startY == targetY && startX < targetX)) {
                int dx = startX - (2*m - targetX);
                int dy = startY - targetY;
                minD = Math.min(minD, dx*dx + dy*dy);
            }
            
            if (!(startX == targetX && startY > targetY)) {
                int dx = startX - targetX;
                int dy = startY - (-targetY);
                minD = Math.min(minD, dx*dx + dy*dy);
            }
            
            if (!(startX == targetX && startY < targetY)) {
                int dx = startX - targetX;
                int dy = startY - (2*n - targetY);
                minD = Math.min(minD, dx*dx + dy*dy);
            }
            
            answer[i] = minD;
        }
        
        return answer;
    }
}
