public class Infected_Tree {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(5);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(2);
        root.right.left = new Node(6);
        root.right.right = new Node(10);


    }
}
