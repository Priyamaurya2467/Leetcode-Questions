import java.util.LinkedList;
import java.util.Queue;

public class order {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));

    }
    public static void nthLevel(Node root, int n){
        if(root == null){
            return;
        }
        if(n==1){
            System.out.print(root.value + " ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);


    }
    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root != null){
            q.add(root);
        }
        while(!q.isEmpty()){
            Node temp = q.peek();
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
            System.out.print(temp.value + " ");
            q.poll();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(10);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
//        int level = 1 + height(root) ;
//        for(int i = 1 ; i <= level ; i++){
//            nthLevel(root,i);     //0(n)
//            System.out.println();
            bfs(root);
        }

    }

