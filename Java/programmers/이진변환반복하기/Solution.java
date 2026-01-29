package java.programmers.이진변환반복하기;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        String stemp = s;
        while(stemp.length() > 1){
            int news = 0;
            for(int i = 0; i < stemp.length(); i++){
                if(stemp.charAt(i) == '1'){
                    news += 1;
                } else{
                    answer[1] += 1;
                }
            }
            answer[0] += 1;
            stemp = Integer.toBinaryString(news);

        }
        
        return answer;
    }
}