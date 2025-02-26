import java.util.*;

class Solution{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int total = 0;
        for (int i = 0; i < n; i++) {
            total = Math.max(total, arr[i] * (i+1));
        }
        System.out.print(total);
        scan.close();
    }
}