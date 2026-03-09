import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class pathSum_II {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }


    public static void helper(List<List<Integer>> ans ,  List<Integer> arr , Node root , int target){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            arr.add(root.value);
            if(root.value == target){
               List<Integer> a = new ArrayList<>();
               for(int i = 0 ; i < arr.size(); i++){
                   a.add(arr.get(i));
               }
                ans.add(a);
            }
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.value);
        helper(ans , arr , root.left ,target - root.value);
        helper(ans , arr , root.right,target-root.value);
        arr.remove(arr.size()-1); //backtracking
    }



    public static List<List<Integer>> hasPathSum(Node root, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(ans , arr , root ,target);
        return ans;

    }



    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(5);
        root.right.right.left = new Node(1);

        int target = 22;

        System.out.println(hasPathSum( root,  target));
    }


}
