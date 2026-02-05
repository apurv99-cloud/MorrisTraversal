
public class SerDeSer {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.left = this.right = null;
            this.val = val;
        }
    }

    // SERIALIZATION
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();

    }

    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null, ");
            return;
        }
        sb.append(root.val).append(",");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    // DESERIALIZATION
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        int[] index = new int[1];
        return deSerializeHelper(nodes, index);

    }

    private TreeNode deSerializeHelper(String[] nodes, int[] index) {

        if (nodes[index[0]].trim().equals("null")) {
            index[0]++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[index[0]].trim()));
        index[0]++;

        root.left = deSerializeHelper(nodes, index);
        root.right = deSerializeHelper(nodes, index);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));