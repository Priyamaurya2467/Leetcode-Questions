public class pathSum_III {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }


    public static int noOfPaths(Node root , int targetSum){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.value == targetSum){
            count++;
            return count+  noOfPaths(root.left, targetSum-root.value) + noOfPaths(root.right, targetSum - root.value);

        }
        return noOfPaths(root.left, targetSum-root.value) + noOfPaths(root.right, targetSum - root.value);
    }

    public static int pathSum(Node root, int sum) {
        if(root == null) return 0;

        int count = noOfPaths(root,sum);
        count = count + pathSum(root.left, sum) + pathSum(root.right, sum );
        return count;
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.right = new Node(-3);
        root.right.right = new Node(11);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.left.right.right = new Node(1);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(2);
        int sum = 8;

        System.out.println(pathSum(root,sum));
        

    }

}
