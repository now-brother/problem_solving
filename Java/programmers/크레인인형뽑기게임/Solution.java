package java.programmers.크레인인형뽑기게임;

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int n = board.length;
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i = 0; i < moves.length; i++){
            int s = moves[i] - 1;
            for(int j = 0; j < n; j++){
                if(board[j][s] != 0){
                    int u = board[j][s];
                    board[j][s] = 0;
                    if(!stack.isEmpty() && stack.peek() == u){
                        stack.pop();
                        answer += 2;
                        break;
                    }else{
                        stack.push(u);
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}
