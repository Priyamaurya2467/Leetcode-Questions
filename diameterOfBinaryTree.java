public class diameterOfBinaryTree {
    public static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value= value;
        }

    }
    public static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value + " -> ");
        if(root.left!=null){
            System.out.print(root.left.value + " , ");
        }
        if(root.right!=null){
            System.out.print(root.right.value );
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)){
            return 0;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }
    public static int diameterOfBinaryTree(Node root){
        if(root==null || (root.left==null && root.right==null)){
            return 0;
        }

        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);


        if(root.left != null ){
            mid++;
        }
        if(root.right != null ){
            mid++;
        }
        return Math.max(leftAns, Math.max(rightAns, mid));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        root.right = new Node(3);
        root.right.left = new Node(6);



        System.out.println(diameterOfBinaryTree(root));
    }
}
