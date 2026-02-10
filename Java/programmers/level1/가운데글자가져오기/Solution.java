package java.programmers.level1.가운데글자가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        
        if(n % 2 == 1){
            answer += s.charAt(n/2);
        }else{
            answer += s.charAt(n/2 - 1);
            answer += s.charAt(n/2);
        }
        
        return answer;
    }
}