package Java.programmers.푸드파이터대회;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 == 0){
                for(int j = 0; j < food[i] / 2; j++){
                    answer += Integer.toString(i);
                }
            }else{
                food[i] -= 1;
                for(int j = 0; j < food[i] / 2; j++){
                    answer += Integer.toString(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        String reverseAns = sb.reverse().toString();
        answer += '0';
        answer += reverseAns;
        
        return answer;
    }
}