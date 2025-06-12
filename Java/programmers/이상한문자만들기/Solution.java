package Java.programmers.이상한문자만들기;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        boolean flag = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += ' ';
                flag = true;
            }else{
                if(flag == true){
                    answer += Character.toUpperCase(s.charAt(i));
                    flag = false;
                }else{
                    answer += Character.toLowerCase(s.charAt(i));
                    flag = true;
                }
            }
        }
        
        return answer;
    }
}