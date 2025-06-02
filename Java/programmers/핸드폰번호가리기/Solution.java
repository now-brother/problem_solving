package Java.programmers.핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int n = phone_number.length();
        for(int i = 0; i < n; i++){
            if(n - i > 4){
                answer += '*';
            }else{
                answer += phone_number.charAt(i);
            }
        }
        
        return answer;
    }
}