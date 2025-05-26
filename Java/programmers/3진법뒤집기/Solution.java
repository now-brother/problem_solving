class Solution {
    public int solution(int n) {
        int answer = 0;

        String num3 = Integer.toString(n, 3);
        String num = "";
        for(int i = 0; i < num3.length(); i++){
            num += num3.charAt(num3.length() - 1 - i);
        }

        for(int i = 0; i < num.length(); i++){
            int tempa = num.charAt(num.length() - 1 - i) - '0';
            int tempb = (int)Math.pow(3, i);
            answer += tempa * tempb;
        }

        return answer;
    }
}