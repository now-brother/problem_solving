package Java.programmers.표편집;

import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        String answer = "";
        int[] initial = new int[n];
        int[] changed = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++){
            initial[i] = i + 1;
            changed[i] = i + 1;
        }
        
        for(int i = 0; i < cmd.length; i++){
            char s = cmd[i].charAt(0);
            if(s == 'D'){
                int j = cmd[i].charAt(2) - '0';
                int cnt = 0;
                while(cnt < j){
                    
                }
            }else if(s == 'U'){
                int j = cmd[i].charAt(2) - '0';
                k -= j;
            }else if(s == 'C'){
                while(changed[k - 1] != 0){
                    stack.push(changed[k - 1]);
                    changed[k - 1] = 0;
                }
            }else if(s == 'Z'){
                int j = stack.pop();
                
            }
        }
        
        return answer;
    }
}