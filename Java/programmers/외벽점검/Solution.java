package Java.programmers.외벽점검;

import java.util.*;

class Solution {

    private int answer = Integer.MAX_VALUE;

    public int solution(int n, int[] weak, int[] dist) {
        int len = weak.length;

        int[] extended = new int[len * 2];
        for (int i = 0; i < len; i++) {
            extended[i] = weak[i];
            extended[i + len] = weak[i] + n;
        }

        List<int[]> permutations = new ArrayList<>();
        permute(dist, 0, permutations);

        for (int start = 0; start < len; start++) {
            for (int[] friends : permutations) {
                int count = 1;
                int pos = extended[start] + friends[0]; 
                for (int i = start + 1; i < start + len; i++) {
                    if (extended[i] > pos) {
                        count++;
                        if (count > dist.length) break;
                        pos = extended[i] + friends[count - 1];
                    }
                }

                answer = Math.min(answer, count);
            }
        }

        return answer > dist.length ? -1 : answer;
    }

    private void permute(int[] arr, int depth, List<int[]> result) {
        if (depth == arr.length) {
            result.add(arr.clone());
            return;
        }
        for (int i = depth; i < arr.length; i++) {
            swap(arr, i, depth);
            permute(arr, depth + 1, result);
            swap(arr, i, depth);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
