/*
 * Problem Statement: Given a Binary Tree, return its right and left views.
 * The Right View of a Binary Tree is a list of nodes that can be seen when the tree 
 * is viewed from the right side. The Left View of a Binary Tree is a list of nodes 
 * that can be seen when the tree is viewed from the left side.
 */

import java.util.*;
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
class Treeviews{
   public static List<Integer> LeftSideview(Node root){
      List<Integer> res=new ArrayList<>();
      recurssionleft(root,0,res);
      return res;
   }
   public static List<Integer> RightSideview(Node root){
    List<Integer> res=new ArrayList<>();
    recurssionright(root,0,res);
    return res;
   }
   public static void recurssionleft(Node root,int level,List<Integer> res){
      if(root==null){
        return;
      }
      if(res.size()==level){
        res.add(root.data);
      }
      recurssionleft(root.left, level+1, res);
      recurssionleft(root.right, level+1, res);
   }

   public static void recurssionright(Node root,int level,List<Integer> res){
    if(root==null){
      return;
    }
    if(res.size()==level){
      res.add(root.data);
    }
    recurssionleft(root.right, level+1, res);
    recurssionleft(root.left, level+1, res);
 }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);
        List<Integer> rightView = RightSideview(root);

        
        System.out.println("Right View Traversal: ");
        for (int node : rightView) {
            System.out.print(node + " ");
        }
        System.out.println();
        List<Integer> leftView =LeftSideview(root);
        System.out.println("Right View Traversal: ");
        for(int val:leftView){
            System.out.println(val +"");
        }
    }
}