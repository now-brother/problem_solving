package Java.programmers.서울에서김서방찾기;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int result = 0;
        
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                result = i;
                break;
            }
        }
        
        answer += "김서방은 ";
        answer += Integer.toString(result);
        answer += "에 있다";
        return answer;
    }
}