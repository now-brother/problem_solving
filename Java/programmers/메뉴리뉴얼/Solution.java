package java.programmers.메뉴리뉴얼;

import java.util.*;

class Solution {
    private static HashMap<Integer, HashMap<String, Integer>> courseMap; 
    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();
        courseMap = new HashMap<>();
        
        for(int i : course){
            courseMap.put(i, new HashMap<>());
        }
        
        for(String order : orders){
            char[] orderArray = order.toCharArray();
            Arrays.sort(orderArray);
            combination(0, orderArray, "");
        }

        for (HashMap<String, Integer> count : courseMap.values()) {
            Optional<Integer> maxOpt = count.values()
                                            .stream()
                                            .max(Comparator.comparingInt(o -> o));
        
            if (maxOpt.isPresent()) {
                int max = maxOpt.get();
                if (max > 1) { 
                    count.entrySet()
                         .stream()
                         .filter(entry -> entry.getValue() == max)
                         .forEach(entry -> answer.add(entry.getKey()));
                }
            }
        }
        
        Collections.sort(answer);
        
        
        return answer.toArray(new String[0]);
    }
    
    public static void combination(int idx, char[] order, String result){
        if(courseMap.containsKey(result.length())){
            HashMap<String, Integer> map = courseMap.get(result.length());
            map.put(result, map.getOrDefault(result, 0 ) + 1);
        }
        
        for (int i = idx; i < order.length; i++){
            combination(i + 1, order, result + order[i]);
        }
    }
}