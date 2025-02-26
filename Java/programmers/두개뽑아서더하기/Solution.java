package Java.programmers.두개뽑아서더하기;

import java.util.*;

public class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> ans = new ArrayList<>();
    
        Arrays.sort(numbers);
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length;j++){
                int temp = numbers[i] + numbers[j];
                if(!ans.contains(temp)){
                    ans.add(temp);
                }
            }
        }
        int[] answer = ans.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
