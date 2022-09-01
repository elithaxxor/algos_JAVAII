////Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
////  If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
////  then reverse the first k characters and leave the other as original.
////
////
//
//
//import java.util.*;
//
//class Solution {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {}
//        TreeNode(int val) {
//            this.val = val;
//        }
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    public class BSTIterator {
//        boolean reverse = true;
//        private Stack<TreeNode> stack = new Stack<TreeNode>();
//        public boolean hasNext() {
//            return
//        }
//        public BSTIterator(TreeNode root, boolean isReverse) {
//            reverse = isReverse;
//            pushAll(root);
//        }
//
//        private void pushAll(TreeNode node) {
//            System.out.println("pushing node to stack \n" + node);
//            while (node != null) {
//                stack.push(node);
//                if (reverse == true) {
//                    node = node.right;
//                } else {
//                    node = node.left;
//                }
//            }
//        }
//
//    }
//    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
//    }
//
//
//        public int[] arrayRankTransform(int[] arr) {
//        System.out.println("Sorted Array");
//        Arrays.sort(arr);
//        int len = arr.length;
//        int end = arr[len-1];
//
//        // create a copy array and print sorted array
//        int copyArr [] = new int[end];
//        for (int j = 0; j <= len-1; j++){
//            copyArr[j] = arr[j];
//            System.out.println(arr[j]);
//        }
//
//        System.out.println("Largest Integer\n" + end);
//        Map<Integer, Integer> placements = new HashMap<>();
//
//
//        for (int i : arr) {
//            if(!placements.containsKey(i)) {
//                System.out.println("adding key");
//                int val = arr[i];
//                placements.put(val, placements.size()+1);
//            }
//        }
//
//        for (int i = 0; i < len; i++) {
//            System.out.println(placements.get(i));
//            System.out.println("new array \n" + copyArr[i]);
//        }
//
//
//        return arr;
//    }
//
//    public static void main(String args[]) { //static method
//        Solution run = new Solution();
//        int[] arr = { 80, 10, 20, 30 };
//        run.arrayRankTransform(arr);
//    }
//}