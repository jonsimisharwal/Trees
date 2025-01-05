/* 
Problem Statement: Given the root of the Binary Tree, return the length of its diameter.
 The Diameter of a Binary Tree is the longest distance between any two nodes of that tree.
  This path may or may not pass through the root.  */
 class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=left;
        this.right=right;
    }
 }

  class Diametertree{
   static int diameter=0;
    public static int getHeight(Node node){
        if(node==null){
            return 0;
        }
       
        int leftheight=getHeight(node.left);
        int rightheight=getHeight(node.right);
        diameter=Math.max(diameter,leftheight+rightheight);
        return Math.max(leftheight,rightheight)+1;
    }
    public static int Diameter(Node node){
        getHeight(node);
        return diameter;
    }
    public static void main(String args[]){
       Node node=new Node(1);
       node.left=new Node(2);
       node.left.left=new Node(3);
       node.left.left.left=new Node(4);
       node.right=new Node(5);
       node.right.left=new Node(6);
       node.right.right=new Node(7);
       node.right.right.right=new Node(8);
       int ans=Diameter(node);
       System.out.println("Diameter of the tree is:"+ ans);
    }
}