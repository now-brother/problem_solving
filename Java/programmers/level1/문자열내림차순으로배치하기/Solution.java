package java.programmers.level1.문자열내림차순으로배치하기;

import java.util.*;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(); 
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }
}
