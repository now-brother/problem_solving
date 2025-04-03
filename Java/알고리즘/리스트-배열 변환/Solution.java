import java.util.*;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2); // ✅ 메서드 안에서는 OK

        int[] arr = array.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");

        String[] arr2 = list.toArray(new String[0]); // ✅ 가장 자주 쓰임

    }
}

