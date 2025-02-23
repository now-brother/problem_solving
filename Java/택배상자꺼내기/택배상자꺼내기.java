import java.util.*;

class 택배상자꺼내기 {
    public static int solution(int n, int w, int num) {
        int answer = 0;
        int h = n / w + 1;  // 행(h) 개수 계산
        int[][] arr = new int[h][w];  // 올바른 배열 크기 설정
        int cnt = 0;
        int x = 0, y = 0;

        // 2차원 배열 생성
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

        System.out.println(Arrays.deepToString.arr);

        // 위로 이동하며 숫자가 존재하는 칸 개수 세기
        for (int i = x; i >= 0; i--) {
            if (arr[i][y] != 0) {
                answer++;
            }
        }
        
        return answer + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 3, 6));  // 기대 출력: 2
    }
}
