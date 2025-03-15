import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            if (s.length() % 2 == 1) continue;
            Stack<Character> stack = new Stack<>();
            stack.push(s.charAt(0)); //첫 단어는 스택에 push
            for (int j = 1; j < s.length(); j++) {
                if (stack.size() > 0 && stack.peek() == s.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(j));
                }
            }
            if (stack.isEmpty()) count++;
        }
        System.out.print(count);
    }    
}
