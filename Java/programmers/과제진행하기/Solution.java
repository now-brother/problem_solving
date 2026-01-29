package java.programmers.과제진행하기;

import java.util.*;

class Solution {
    static class Task {
        String name;
        int start;
        int playtime;
        
        Task(String name, String start, String playtime) {
            this.name = name;
            this.start = toMinute(start);
            this.playtime = Integer.parseInt(playtime);
        }
        
        private int toMinute(String time) {
            String[] t = time.split(":");
            return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
        }
    }
    
    public String[] solution(String[][] plans) {
        List<Task> tasks = new ArrayList<>();
        for (String[] p : plans) {
            tasks.add(new Task(p[0], p[1], p[2]));
        }
        
        tasks.sort(Comparator.comparingInt(t -> t.start));
        
        List<String> result = new ArrayList<>();
        Stack<Task> stack = new Stack<>();
        
        for (int i = 0; i < tasks.size(); i++) {
            Task cur = tasks.get(i);
            int curStart = cur.start;
            int curPlay = cur.playtime;
            
            int nextStart = (i < tasks.size() - 1) ? tasks.get(i+1).start : Integer.MAX_VALUE;
            
            if (curStart + curPlay <= nextStart) {
                result.add(cur.name);
                int freeTime = nextStart - (curStart + curPlay);
                
                while (!stack.isEmpty() && freeTime > 0) {
                    Task prev = stack.pop();
                    if (prev.playtime <= freeTime) {
                        result.add(prev.name);
                        freeTime -= prev.playtime;
                    } else {
                        prev.playtime -= freeTime;
                        stack.push(prev);
                        break;
                    }
                }
            } else {
                cur.playtime -= (nextStart - curStart);
                stack.push(cur);
            }
        }
        
        while (!stack.isEmpty()) {
            result.add(stack.pop().name);
        }
        
        return result.toArray(new String[0]);
    }
}

