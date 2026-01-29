package java.programmers.개인정보수집유효기간;

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < terms.length; i++) {
            String[] cmd = terms[i].split(" ");
            char type = cmd[0].charAt(0);
            int period = Integer.parseInt(cmd[1]);
            hash.put(type, period);
        }

        int[] todayArr = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();
        int todayTotal = todayArr[0] * 12 * 28 + todayArr[1] * 28 + todayArr[2];

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] cmd = privacies[i].split(" ");
            String date = cmd[0];
            char type = cmd[1].charAt(0);

            int[] dateArr = Arrays.stream(date.split("\\.")).mapToInt(Integer::parseInt).toArray();
            int dateTotal = dateArr[0] * 12 * 28 + dateArr[1] * 28 + dateArr[2];
            int expire = dateTotal + (hash.get(type) * 28);

            if (expire <= todayTotal) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
