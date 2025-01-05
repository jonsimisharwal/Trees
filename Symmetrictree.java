class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Symmetrictree{
    public static boolean checkSymmetric(Node root1,Node root2){
        if(root1==null&& root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        return root1.data==root2.data && checkSymmetric(root1.left, root2.left) && checkSymmetric(root1.right, root2.right);
    }
    public static boolean isSymmetric(Node root){
        if(root==null){
            return true;
        }
        return checkSymmetric(root.left,root.right);
    }
    public static void main(String args[]){
      Node root=new Node(1);
      root.left=new Node(3);
      root.right=new Node(4);
      root.left.left=new Node(5);
      root.right.right=new Node(6);
      boolean ans=isSymmetric(root);
      System.out.println("check it is a symmetric tree?"+ ans);
    }
}