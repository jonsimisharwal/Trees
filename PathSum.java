/*
 * Problem Statement: Given a Binary Tree, determine the maximum sum achievable along 
 * any pathwithin the tree. A path in a binary tree is defined as a sequence of nodes where 
 * each pair of adjacent nodes is connected by an edge
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
class PathSum{
    public static int Findpathsum(Node root,int maxi[]){
        if(root==null){
            return 0;
        }
        int leftpath=Math.max(0,Findpathsum(root.left,maxi));
        int rightpath=Math.max(0,Findpathsum(root.right,maxi));
        maxi[0]=Math.max(maxi[0],leftpath+rightpath+root.data);
        return Math.max(leftpath,rightpath)+root.data;
    }
    public static int PathSum(Node root){
    int maxi[]={Integer.MIN_VALUE};
    Findpathsum(root, maxi);
    return maxi[0];
    }
    public static void main(String args[]){
     Node root=new Node(1);
      root.left=new Node(2);
      root.right=new Node(3);
      root.left.left=new Node(4);
      root.left.right=new Node(5);
      root.right.left=new Node(6);
      root.right.right=new Node(7);
      int ans=PathSum(root);
      System.out.println("Maximum path sum is:"+ ans);
     

    }
}