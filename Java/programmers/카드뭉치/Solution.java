package java.programmers.카드뭉치;

import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queueCard1 = new ArrayDeque<>(Arrays.asList(cards1));
        Queue<String> queueCard2 = new ArrayDeque<>(Arrays.asList(cards2));
        Queue<String> queueGoal = new ArrayDeque<>(Arrays.asList(goal));
        
        String answer = "Yes";
        while(!queueGoal.isEmpty()){
            if(!queueCard1.isEmpty() && queueCard1.peek().equals(queueGoal.peek())){
                queueCard1.poll();
                queueGoal.poll();
            }else if(!queueCard2.isEmpty() && queueCard2.peek().equals(queueGoal.peek())){
                
                queueCard2.poll();
                queueGoal.poll();
            }else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
