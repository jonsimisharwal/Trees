/*
Problem Statement: Given a Binary Tree, return true if it is a Balanced Binary Tree 
else return false. A Binary Tree is balanced if, for all nodes in the tree, the 
difference between left and right subtree height is not more than 1.
*/
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
 class Balancedht{
    public static boolean isBalanced(Node root){
        if(root==null){
            return true;
        }
        int leftheight= getHeight(root.left);
        int rightheight=getHeight(root.right);
        if( Math.abs(leftheight-rightheight)<=1&& isBalanced(root.left)&&
         isBalanced(root.right)){
            return true;
         }
         return false;
    }
    public static int getHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftht=getHeight(root.left);
        int rightht=getHeight(root.right);
        return Math.max(leftht,rightht)+1;
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        
        root.right.left=new Node(8);
        
        boolean ans=isBalanced(root);
        System.out.println("is it a balanced tree? "+ ans);
    }
}