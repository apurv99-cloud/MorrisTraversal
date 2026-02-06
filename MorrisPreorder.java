import java.util.*;

class MorrisPreorder {
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        TreeNode IP;
        while (root != null) {
            if (root.left == null) {
                answer.add(root.val);
                root = root.right;
            } else {
                // find InOrder Predecessor
                IP = root.left;
                while (IP.right != null && IP.right != root) {
                    IP = IP.right;

                }

                if (IP.right == null) {
                    answer.add(root.val);
                    IP.right = root; // create thread
                    root = root.left;
                } else {
                    IP.right = null; // delete threads
                    root = root.right;
                }

            }
        }
        return answer;

    }
}