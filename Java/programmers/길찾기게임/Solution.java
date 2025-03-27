package Java.programmers.길찾기게임;

public class Solution {

    public int[][] solution(int[][] nodeinfo) {
        int[][] answer = new int[2][nodeinfo.length];
        
        int[] nodes = new int[2];

        answer[0] = preorder(nodes, 0);
        answer[1] = postorder(nodes, 0);
        
        return answer;
    }
    

    private static int[] preorder(int[] nodes, int idx) {
        if (idx >= nodes.length || nodes[idx] == -1) {
            return new int[0];
        }
    
        int[] left = preorder(nodes, idx * 2 + 1);
        int[] right = preorder(nodes, idx * 2 + 2);
    
        int[] result = new int[1 + left.length + right.length];
    
        result[0] = nodes[idx];
        System.arraycopy(left, 0, result, 1, left.length);
        System.arraycopy(right, 0, result, 1 + left.length, right.length);
    
        return result;
    }
    

    private static int[] postorder(int[] nodes, int idx) {
        if (idx >= nodes.length || nodes[idx] == -1) {
            return new int[0];
        }
    
        int[] left = postorder(nodes, idx * 2 + 1);
        int[] right = postorder(nodes, idx * 2 + 2);
    
        int[] result = new int[left.length + right.length + 1];
    
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(right, 0, result, left.length, right.length);
        result[result.length - 1] = nodes[idx];
    
        return result;
    }
    
}
