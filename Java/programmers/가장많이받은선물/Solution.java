package Java.programmers.가장많이받은선물;

import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        int[][] giftCount = new int[n][n];
        int[] giveTotal = new int[n];      
        int[] takeTotal = new int[n];      
        int[] nextGift = new int[n];       

        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(friends[i], i);
        }

        for (String g : gifts) {
            String[] cmd = g.split(" ");
            int from = indexMap.get(cmd[0]);
            int to = indexMap.get(cmd[1]);

            giftCount[from][to]++;
            giveTotal[from]++;
            takeTotal[to]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) continue;

                int ij = giftCount[i][j];
                int ji = giftCount[j][i];

                if (ij > ji) {
                    nextGift[i]++;
                } else if (ji > ij) {
                    nextGift[j]++;
                } else {
                    int scoreI = giveTotal[i] - takeTotal[i];
                    int scoreJ = giveTotal[j] - takeTotal[j];

                    if (scoreI > scoreJ) {
                        nextGift[i]++;
                    } else if (scoreJ > scoreI) {
                        nextGift[j]++;
                    }
                }
            }
        }

        int answer = 0;
        for (int cnt : nextGift)
            answer = Math.max(answer, cnt);
        

        return answer;
    }
}

