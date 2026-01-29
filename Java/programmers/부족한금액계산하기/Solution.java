package java.programmers.부족한금액계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for(int i = 0; i < count; i++){
            total = total + (price * (i + 1));
        }
        
        answer = -(money - total);
        
        return answer >= 0 ? answer : 0;
    }
}