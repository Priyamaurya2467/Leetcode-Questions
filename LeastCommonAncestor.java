

public class LeastCommonAncestor {
    public static  class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    public static boolean contains(Node root , Node node){
        if(root == null){
            return false;
        }
        if(root == node){
            return true;
        }

        return contains(root.left,node) || contains(root.right,node);
    }

    public static Node LCA(Node root , Node p , Node q){
        if(p == root || q == root){
            return root;
        }
        if(p==q){
            return q;
        }

        boolean leftp = contains(root.left , p);
        boolean rightp = contains(root.right , q);
        if(leftp && rightp || !leftp && rightp){
            return root;
        }
        if(leftp){
            return LCA(root.left, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.left.right.left = new  Node(7);
        root.left.right.right = new Node(4);
        root.right = new Node(1);
        root.right.left = new Node(0);
        root.right.right  = new Node (8);

        System.out.println(LCA(root , root.left , root.right ));
    }

}
