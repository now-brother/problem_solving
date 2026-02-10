package java.programmers.level1.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int sum = 0;
        int n = arr.length;
        
        for(int i : arr)
            sum += i;
        
        answer = (double) sum / n;
        
        return answer;
    }
}
