class Solution {
    public String solution(int a, int b) {
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int totalDays = 0;

        for (int i = 1; i < a; i++) {
            totalDays += daysInMonth[i];
        }

        totalDays += b - 1;

        return week[totalDays % 7];
    }
}
