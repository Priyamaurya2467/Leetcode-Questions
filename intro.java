public class intro {
   public static class Node{
       int value;
       Node left;
       Node right;
       public Node(int value){
           this.value =value;
       }
   }

   private Node rotate(Node root){
       if (height(root.left) - height(root.right) > 1){
           if(height(root.left.left) - height(root.left.right) > 0){
               return rightRotate(root);
           }
           if(height(root.left.left) - height(root.left.right) > 0) {
               //left right case
               root.left = leftRotate(root.left);
               return rightRotate(root.left);

           }
           }
       return root;

       }
   }

    public static void main(String[] args) {
        Node root = new Node(13);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
        root.left.left .left = new Node(4);
        root.left.left.right = new Node(6);
        root.right.right = new Node(16);

        display(root);

    }

}