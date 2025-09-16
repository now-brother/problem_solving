package Java.programmers.문자열반복해서출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.printf(str);
        }
        sc.close();
    }
}
