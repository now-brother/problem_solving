package Java.programmers.기지국설치;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int coverage = 2 * w + 1; 
        int position = 1; 
        int index = 0; 

        while (position <= n) {
            if (index < stations.length && position >= stations[index] - w) {
                position = stations[index] + w + 1;
                index++;
            } else {
                answer++;
                position += coverage;
            }
        }
        return answer;
    }
}
