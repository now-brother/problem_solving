package java.programmers.level2.광물캐기;

import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;

        int totalPicks = picks[0] + picks[1] + picks[2];
        int maxMine = Math.min(minerals.length, totalPicks * 5); 
        
        int lenM = (maxMine + 4) / 5; 
        String[][] temp = new String[lenM][5];
        int[] arr = new int[lenM]; 

        for (int i = 0; i < maxMine; i++) {
            temp[i / 5][i % 5] = minerals[i];
        }

        for (int g = 0; g < lenM; g++) {
            int stoneCost = 0;
            for (int k = 0; k < 5; k++) {
                String m = temp[g][k];
                if (m == null) continue;
                if (m.equals("diamond")) stoneCost += 25;
                else if (m.equals("iron")) stoneCost += 5;
                else stoneCost += 1;
            }
            arr[g] = stoneCost;
        }

        Integer[] order = new Integer[lenM];
        for (int i = 0; i < lenM; i++) order[i] = i;
        Arrays.sort(order, (a, b) -> arr[b] - arr[a]);

        for (int idx : order) {
            int pickType = -1;

            if (picks[0] > 0) {    
                pickType = 0; picks[0]--;
            } else if (picks[1] > 0) { 
                pickType = 1; picks[1]--;
            } else if (picks[2] > 0) { 
                pickType = 2; picks[2]--;
            } else {
                break;
            }

            answer += mining(pickType, temp[idx]);
        }

        return answer;
    }

    private int mining(int pickType, String[] mineral) {
        int fatigue = 0;

        for (int i = 0; i < 5; i++) {
            String m = mineral[i];
            if (m == null) continue;

            if (pickType == 0) { 
                fatigue += 1;
            } else if (pickType == 1) { 
                fatigue += m.equals("diamond") ? 5 : 1;
            } else { 
                if (m.equals("diamond")) fatigue += 25;
                else if (m.equals("iron")) fatigue += 5;
                else fatigue += 1;
            }
        }

        return fatigue;
    }
}
