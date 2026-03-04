import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    public static List<String> binaryTree(Node root){
        List<String> list =new ArrayList<>();
        helper(root,list ,"");
        return list;
    }

    public static void helper(Node root,List<String> list , String s){
        if(root==null ){
            return;
        }
        if(root.left == null && root.right == null){
            s= s+root.value;
            list.add(s);
            return;        }

        helper(root.left , list , s  + root.value + " -> ");
        helper(root.right , list , s  + root.value + " -> ");

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(binaryTree(root));
    }
}
