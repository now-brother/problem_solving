class Solution {
    public int solution(int n) {
        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int temp = (a + b) % 1000000007;
            a = b;
            b = temp;
        }

        return n == 1 ? a : b;
    }
}
