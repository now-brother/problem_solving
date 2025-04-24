package Java.programmers.튜플;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);

        String[] arr = s.split("},\\{");

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (String group : arr) {
            String[] nums = group.split(",");
            for (String numStr : nums) {
                int num = Integer.parseInt(numStr);
                if (!seen.contains(num)) {
                    seen.add(num);
                    result.add(num);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}