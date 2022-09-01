import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
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

    class Solution { // Inorder traversal - return ssorted array from tree
        public List<Integer> inorderTraversal(TreeNode root) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            List<Integer> savedStack = new ArrayList<>() {
            };
            if (root == null) {
                return null;
            }
            TreeNode current = root;

            while (current != null || !stack.isEmpty()) {
                System.out.println("current != null || !stack.isEmpty()");
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }
                current = stack.pop();
                savedStack.add(current.val);
                current = current.right;
            }
            return null;
        }


        // To Solve two sum addtion-> create a list to store values; and run a traversal to order the tree.
        public boolean twoSumBst(TreeNode root, int k){
            List <Integer> inOrderArr = new ArrayList<>();
            int left = 0;
            int right = inOrderArr.size() - 1;
            System.out.println("Searching for \n " + k + "\n" + left + " " + right );
            while (left < right) {
                if (inOrderArr.get(left) + inOrderArr.get(right) == k) {
                    System.out.println("Found sum of two nodes: \n" + inOrderArr.get(left) + inOrderArr.get(right));
                    return true;
                }
                if (inOrderArr.get(left) + inOrderArr.get(right) < k ) {
                    left++;
                } else {
                    right--;
                }
            }
            return false;
        }

        public void twoSumInorder(TreeNode root, List<Integer> inOrderArr) {
            if (root == null ) {
                return;
            }
            twoSumInorder(root.left, inOrderArr);
            inOrderArr.add(root.val);
            twoSumInorder(root.right, inOrderArr);
        }
    }



}