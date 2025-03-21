package Java.programmers.오픈채팅방;

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> hash1 = new HashMap<>();
        hash1.put("Enter", "님이 들어왔습니다.");
        hash1.put("Leave", "님이 나갔습니다.");
        
        HashMap<String, String> hash2 = new HashMap<>();
        for(String s : record) {
            String[] cmd = s.split(" ");
            if(cmd.length == 3){
                hash2.put(cmd[1], cmd[2]);
            }
        }
        
        ArrayList<String> answer = new ArrayList<>();
        
        for(String s : record){
            String[] cmd = s.split(" ");
            if(hash1.containsKey(cmd[0]))
                answer.add(hash2.get(cmd[1]) + hash1.get(cmd[0]));
        }
        return answer.toArray(new String[0]);
    }
}