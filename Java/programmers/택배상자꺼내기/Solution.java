package java.programmers.택배상자꺼내기;

public class Solution {
    
    public static int solution(int n, int w, int num) {
        int answer = 0;
        int h = n / w + 1;
        int[][] arr = new int[h][w];
        int cnt = 0;
        int x = 0, y = 0;

        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                cnt = i * w + 1;
                for (int j = 0; j < w; j++) {
                    if (cnt <= n) {
                        arr[i][j] = cnt;
                        if (cnt == num) { x = i; y = j; }
                    }
                    cnt++;
                }
            } else {
                cnt = (i + 1) * w;
                for (int j = 0; j < w; j++) {
                    if (cnt <= n) {
                        arr[i][j] = cnt;
                        if (cnt == num) { x = i; y = j; }
                    }
                    cnt--;
                }
            }
        }

        for (int i = x; i < h; i++) {
            if (arr[i][y] != 0) {
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 3, 6));  // 기대 출력: 2
    }
}