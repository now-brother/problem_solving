package Java.programmers.둘만의암호;

import java.util.*;

class Solution {
    
    public char plus(char c){
        if(c == 'z')
            return 'a';
        else
            return (char)(c + 1);
    }
    
    public String solution(String s, String skip, int index) {
        String answer = "";
        HashMap<Character, String> hash = new HashMap<>();
        
        for(int i = 0; i < skip.length(); i++){
            char c = skip.charAt(i);
            hash.put(c, "skip");
        } 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = 0; j < index; j++){
                c = plus(c);
                while(hash.containsKey(c)){
                    c = plus(c);
                }
            }
            answer += c;
        }
        
        return answer;
    }
}
