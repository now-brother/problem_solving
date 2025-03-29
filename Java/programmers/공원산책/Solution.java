package Java.programmers.공원산책;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int w = park[0].length();
        int h = park.length;
        int x = 0, y = 0;
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(park[i].charAt(j) == 'S'){
                    x = j;
                    y = i;
                }       
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            String[] cmd = routes[i].split(" ");
            char dir = cmd[0].charAt(0);
            int len = Integer.parseInt(cmd[1]);
            if(validCheck(dir, len, park, x, y, w, h)){
                switch(dir){
                    case 'S':
                        y = y + len;
                        break;
                    case 'E' :
                        x = x + len;
                        break;
                    case 'W' :
                        x = x - len;
                        break;
                    case 'N':
                        y = y - len;
                        break;
                }
            }
        }
        
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
    
    private static boolean validCheck(char direction, int len, String[] park, int x, int y, int w, int h){
        for (int i = 0; i < len; i++) {
            if (direction == 'E') x++;
            else if (direction == 'W') x--;
            else if (direction == 'S') y++;
            else if (direction == 'N') y--;

            if (x < 0 || x >= w || y < 0 || y >= h) return false;
            if (park[y].charAt(x) == 'X') return false;
        }
        
        return true;
    }
}
