package Java.programmers.다단계칫솔판매;
import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int n = enroll.length;
        int[] answer = new int[n];
        HashMap<String, String> parentMap = new HashMap<>();
        HashMap<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            parentMap.put(enroll[i], referral[i]);
            indexMap.put(enroll[i], i);
        }

        for (int i = 0; i < seller.length; i++) {
            String current = seller[i];
            int money = amount[i] * 100;

            while (!current.equals("-") && money > 0) {
                int idx = indexMap.get(current);
                int fee = money / 10;
                int keep = money - fee;

                answer[idx] += keep;

                current = parentMap.get(current);
                money = fee;
            }
        }

        return answer;
    }
}