public class Codec {
    public String serialize(TreeNode root) {
        if (root == null) return "#,";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                sb.append("#,");
                continue;
            }

            sb.append(node.val).append(",");
            q.add(node.left);
            q.add(node.right);
        }

        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        if (arr[0].equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            TreeNode node = q.poll();
            if (!arr[i].equals("#")) {
                node.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(node.left);
            }
            i++;
            if (i < arr.length && !arr[i].equals("#")) {
                node.right = new TreeNode(Integer.parseInt(arr[i]));
                q.add(node.right);
            }
            i++;
        }

        return root;
    }
}
