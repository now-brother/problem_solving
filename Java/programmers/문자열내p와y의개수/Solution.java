package java.programmers.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {
        int countp = 0;
        int county = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                countp++;
            }else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                county++;
            }
        }
        
        if(countp == county)
            return true;
        return false;
    }
}
