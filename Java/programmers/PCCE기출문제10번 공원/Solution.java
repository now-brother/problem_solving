import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        Arrays.sort(mats);

        for (int i : mats) {
            if (check(i, park))
                answer = i;
        }
        
        return answer;
    }

    public boolean check(int size, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;

        for (int i = 0; i <= rows - size; i++) {
            for (int j = 0; j <= cols - size; j++) {
                boolean canPlace = true;

                for (int r = 0; r < size; r++) {
                    for (int c = 0; c < size; c++) {
                        if (!park[i + r][j + c].equals("-1")) {
                            canPlace = false;
                            break;
                        }
                    }
                    if (!canPlace) break;
                }
                if (canPlace) return true;
            }
        }
        
        return false;
    }
}

