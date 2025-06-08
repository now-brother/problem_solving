package Java.programmers.자연수뒤집어배열로만들기;

class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        int k = s.length();
        int[] answer = new int[k];
                
        for(int i = 0; i < k; i++){
            answer[i] = s.charAt(k-i-1) - '0';
        }
        
        return answer;
    }
}