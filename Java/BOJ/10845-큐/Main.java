import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();

        int back = -1;

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    queue.add(Integer.parseInt(command[1]));
                    back = Integer.parseInt(command[1]);
                    break;
                case "pop":
                    sb.append(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
                    break;
                case "back":
                    if(queue.isEmpty()){
                        back = -1;
                        sb.append("-1\n");
                    }else{
                        sb.append(back + "\n");
                    }
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
