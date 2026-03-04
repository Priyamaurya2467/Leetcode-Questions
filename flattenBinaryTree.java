public class flattenBinaryTree {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }

    }
    public static void flatten(Node root){
        if(root == null){
            return;
        }
        Node leftTree = root.left;
        Node rightTree = root.right;
        root.left = null;
        flatten(leftTree);
        flatten(rightTree);
        root.right =leftTree;
        Node temp = leftTree;
        
        while( temp != null && temp.right != null){
            temp = temp.right;
        }
        if(temp != null){
            temp.right = rightTree;
        }
        else{
            root.right = rightTree;
        }
    }




    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.right = new Node(6);

        flatten(root);
    }

}
