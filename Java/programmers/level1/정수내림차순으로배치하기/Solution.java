package java.programmers.level1.정수내림차순으로배치하기;

class Solution {
    public long solution(long n) {
        String ns = String.valueOf(n);
        char[] arr = ns.toCharArray();
        for(int i = 0; i < ns.length(); i++){
            for(int j = i; j < ns.length(); j++){
                if(arr[i] < arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String result = new String(arr);
        long answer = Long.parseLong(result);
        
        return answer;
    }
}