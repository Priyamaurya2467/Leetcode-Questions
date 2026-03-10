public class sameTree {
    public static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public static boolean  sameTree(Node p , Node q){
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

    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);


        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        System.out.println(sameTree(p,q));
    }

}
