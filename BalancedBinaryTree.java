public class BalancedBinaryTree {
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
        public static void display(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.value + " -> ");
            if(root.left!= null){
                System.out.print(root.left.value + " ");
            }

            if(root.right!= null){
                System.out.print(root.right.value + " ");
            }

            System.out.println();
            display(root.left);
            display(root.right);

    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node a =  new Node(2);
        Node b = new Node(6);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        c.left = e;

//        display(root);
        System.out.println(heightBalancedBinaryTree(root));
    }
    public static boolean heightBalancedBinaryTree(Node root){
        if(root==null){
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        if(root.left != null){
            lh++;
        }

        if(root.right != null){
            rh++;
        }

        int d = lh-rh;
        if(d<0){
            d = -d;
        }
        if(d>1){
            return false;
        }
        return   heightBalancedBinaryTree(root.left) && heightBalancedBinaryTree(root.right);

    }
    static int height(Node root){
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }



}
