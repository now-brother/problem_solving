package java.programmers.하샤드수;

class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String s = Integer.toString(x);
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            temp += (int)s.charAt(i) - '0';
        }
                
        if(x % temp == 0)
            answer = true;
        
        return answer;
    }
}