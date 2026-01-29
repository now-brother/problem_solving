package java.programmers.프로세스;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < priorities.length; i++){
            queue.add(priorities[i]);
        }
        
        while(!queue.isEmpty()){
            int max = Collections.max(queue);
            if(queue.peek() == max){
                if(location == 0){
                    System.out.println(answer);
                    break;
                }else{
                    queue.poll();
                    location -= 1;
                    if(location == -1)
                        location = queue.size() - 1;
                    answer += 1;
                }
            }else if(queue.peek() < max){
                queue.add(queue.poll());
                location -= 1;
                    if(location == -1)
                        location = queue.size() - 1;

            }
        }

        return answer + 1;
    }
}