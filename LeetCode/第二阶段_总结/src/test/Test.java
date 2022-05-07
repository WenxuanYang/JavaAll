package test;

import java.util.*;


/**
 * @author Jerry.Y
 * @description
 * @create 2021-11-09-15:45
 */

public class Test {
    public static void main(String[] args) {
//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//        TreeNode n4 = new TreeNode(4);
//        TreeNode n5 = new TreeNode(5);
//        TreeNode n6 = new TreeNode(6);
//        TreeNode n7 = new TreeNode(7);

//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(4);
//
//        ListNode n4 = new ListNode(1);
//        ListNode n5 = new ListNode(3);
//        ListNode n6 = new ListNode(4);
//
//        n1.next = n2;
//        n2.next = n3;
//
//        n4.next = n5;
//        n5.next = n6;
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        Set<List<Integer>> st = new HashSet<>();
//        st.add(list1);
//        st.add(list2);
//        System.out.println(st.size());

        Solution slu = new Solution();
        System.out.println(slu.maximalSquare(null));
    }
}

class Solution {
    public int maximalSquare(char[][] matrix) {
        return 0;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

;