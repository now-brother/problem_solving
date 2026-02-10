package java.programmers.level3.길찾기게임;

import java.util.*;

public class Solution {

    public int[][] solution(int[][] nodeinfo) {
        int[][] answer = new int[2][nodeinfo.length];

        Node root = makeBT(nodeinfo);

        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        preorder(root, pre);
        postorder(root, post);

        for (int i = 0; i < nodeinfo.length; i++) {
            answer[0][i] = pre.get(i);
            answer[1][i] = post.get(i);
        }

        return answer;
    }

    private static class Node {
        int x, y, num;
        Node left, right;

        public Node(int num, int x, int y) {
            this.num = num;
            this.x = x;
            this.y = y;
        }
    }

    private static Node makeBT(int[][] nodeinfo) {
        Node[] nodes = new Node[nodeinfo.length];

        for (int i = 0; i < nodeinfo.length; i++) {
            nodes[i] = new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1]);
        }

        Arrays.sort(nodes, (a, b) -> {
            if (a.y == b.y) return Integer.compare(a.x, b.x);
            return Integer.compare(b.y, a.y); 
        });

        Node root = nodes[0];

        for (int i = 1; i < nodes.length; i++) {
            insertNode(root, nodes[i]);
        }

        return root;
    }

    private static void insertNode(Node parent, Node child) {
        if (child.x < parent.x) {
            if (parent.left == null) {
                parent.left = child;
            } else {
                insertNode(parent.left, child);
            }
        } else {
            if (parent.right == null) {
                parent.right = child;
            } else {
                insertNode(parent.right, child);
            }
        }
    }

    private static void preorder(Node node, List<Integer> result) {
        if (node == null) return;
        result.add(node.num);
        preorder(node.left, result);
        preorder(node.right, result);
    }

    private static void postorder(Node node, List<Integer> result) {
        if (node == null) return;
        postorder(node.left, result);
        postorder(node.right, result);
        result.add(node.num);
    }
}
