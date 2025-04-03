package Java.programmers.바탕화면정리;

class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            String s = wallpaper[i];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '#') {
                    minX = Math.min(minX, i); 
                    minY = Math.min(minY, j); 
                    maxX = Math.max(maxX, i + 1);
                    maxY = Math.max(maxY, j + 1);
                }
            }
        }

        return new int[]{minX, minY, maxX, maxY};
    }
}
