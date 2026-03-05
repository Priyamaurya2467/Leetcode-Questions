import javax.swing.tree.TreeNode;

public class invertBinaryTree {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }

    }
    public static Node invertTree(Node root){
        if(root==null){
            return root;
        }
        Node l = root.left;
        Node r = root.right;
        root.left = invertTree(r);
        root.right = invertTree(l);
        return root;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(invertTree(root));

    }
}
