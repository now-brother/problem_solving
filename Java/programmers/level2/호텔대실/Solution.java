package java.programmers.level2.호텔대실;

import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (a, b) -> a[0].compareTo(b[0]));

        ArrayList<String[]> list = new ArrayList<>();

        for(int i = 0; i < book_time.length; i++){
            String startT = book_time[i][0];
            String[] part = startT.split(":");
            int startTotal = Integer.parseInt(part[0]) * 60 + Integer.parseInt(part[1]);

            boolean assigned = false;

            for(int j = 0; j < list.size(); j++){
                String endT = list.get(j)[1];
                String[] parts = endT.split(":");
                int endTotal = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]) + 10;

                if(startTotal >= endTotal){
                    list.set(j, book_time[i]);
                    assigned = true;
                    break;
                }
            }

            if(!assigned) list.add(book_time[i]);
        }

        return list.size();
    }
}
