// LeetCode 199
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public class Binary_right_view {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left  = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(4);
        //rightview(root);
        System.out.println(recursive(root));


    }
    public static void rightview(Node root){

        if(root==null){
            return ;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();

            for(int i=0;i<n;i++){
                Node node=queue.poll();

                //last node of the level
                if(i == n-1){
                    System.out.print(node.data + " ");
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
    }



    public static ArrayList<Integer> recursive(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        while(root!=null) {



            list.add(root.data);
            root=root.right;

        }

        return list;
    }
}
