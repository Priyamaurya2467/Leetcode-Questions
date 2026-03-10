import org.w3c.dom.ls.LSOutput;

public class preorder {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.value + " ");

        preorder(root.right);
        System.out.println();
    }


    public static void postorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);


        preorder(root.right);
        System.out.print(root.value + " ");

       ;
    }




//    public static void display(Node root){
//        if(root==null){
//            return;
//        }
//        System.out.print(root.value +  " -> ");
//        if(root.left!=null){
//            System.out.print(root.left.value + "  ");
//        }
//        if(root.right!=null){
//            System.out.print(root.right.value + "  ");
//        }
//        System.out.println();
//        display(root.left);
//        display(root.right);
//    }


    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(7);
        Node d = new Node(9);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(10);
        b.right = e;
        b.left = f;

//        display(root);
        preorder(root);
        System.out.println();
        inorder(root);
        postorder(root);


        System.out.println();
    }
}
