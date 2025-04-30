package Java.programmers.캐릭터의좌표;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int width = (board[0] - 1) / 2;
        int height = (board[1] - 1) / 2;
        
        for(String s : keyinput){
            if(s.equals("up")){
                if(answer[1] + 1 <= height)
                    answer[1] += 1;
            }else if(s.equals("down")){
                if(answer[1] - 1 >= -height)
                    answer[1] -= 1;
            }else if(s.equals("left")){
                if(answer[0] - 1 >= -width)
                    answer[0] -= 1;
            }else if(s.equals("right")){
                if(answer[0] + 1 <= width)
                    answer[0] += 1;
            }
        }
        
        return answer;
    }
}