package java.programmers.level1.신고결과받기;

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;
        int[] answer = new int[n];

        HashMap<String, Integer> reported = new HashMap<>();
        HashMap<String, ArrayList<String>> reporter = new HashMap<>();

        for (String s : report) {
            String[] cmd = s.split(" ");
            String from = cmd[0];
            String to = cmd[1];

            reporter.putIfAbsent(from, new ArrayList<>());
            if (!reporter.get(from).contains(to)) {
                reporter.get(from).add(to);
                reported.put(to, reported.getOrDefault(to, 0) + 1);
            }
        }
        
        for (int i = 0; i < n; i++) {
            String user = id_list[i];
            if (!reporter.containsKey(user)) continue;

            int cnt = 0;
            for (String target : reporter.get(user)) {
                if (reported.getOrDefault(target, 0) >= k) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
