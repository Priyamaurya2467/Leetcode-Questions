public class Morris_Traversal {
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
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left;
                while(pred.right != null){
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }

    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.right.left = new Node(7);
        root.right.right.left = new Node(8);
        flatten(root);
    }
}
