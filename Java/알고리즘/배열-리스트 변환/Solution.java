import java.util.ArrayList;

public class Solution {
    ArrayList<Integer> array = new ArrayList<>();

    int[] arr1 = array.stream().mapToInt(i -> i).toArray();
    String[] arr2 = array.toArray(new String[0]);

}



