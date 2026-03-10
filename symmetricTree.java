public class symmetricTree {
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
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

    public static boolean sameTree(Node p , Node q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.value!=q.value){
            return false;
        }
        return sameTree(p.left,q.left) && sameTree(p.right,q.right);
    }

    public static boolean symmetricTree(Node root){
        if(root==null){
            return true;
        }
        root.left = invertTree(root.left);
        return sameTree(root.left , root.right) ;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.left.right = new Node(5);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        root.right.right.left = new Node(5);

        System.out.println(symmetricTree(root));
    }

}


