public class pathSum {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value= value;
        }
    }

    public static boolean hasPathSum(Node root , int target){
        if(root != null && root.left == null && root.right == null){
            return root.value == target;
        }
        if(root == null){
            return false;
        }
        return hasPathSum(root.left,target-root.value) || hasPathSum(root.right,target-root.value);

    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left =  new Node(1);
        root.left.left.right =  new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        int target = 25;

        System.out.println(hasPathSum(root , target));

    }
}
