package java.programmers.level2.최대값과최소값;

class Solution {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        String[] arr = s.split(" ");
        
        for(String temps : arr){
            int temp = Integer.parseInt(temps);
            if(temp < min){
                min = temp;
            }
            if(temp > max){
                max = temp;
            }
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}
