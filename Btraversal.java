


/*
 * Problem Statement: Given a Binary Tree, perform the boundary traversal of the tree. 
 * The boundary traversal is the process of visiting the boundary nodes of the binary tree
 *  in the anticlockwise direction, starting from the root.
 */
import java.util.ArrayList;
import java.util.List;

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
class Btraversal{
    public static boolean isLeaf(Node root){
        return root.left==null&& root.right==null;
    }
    public static void addLeftboundary(Node root,List<Integer> res){
        Node curr=root.left;
        while(curr!=null){
            if(!isLeaf(curr)){
                res.add(curr.data);
            }
            if(curr.left!=null){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
        
    }
    public static void addRightboundary(Node root,List<Integer> res){
        Node curr=root.right;
        List<Integer> temp=new ArrayList<>();
        if(!isLeaf(curr)){
            temp.add(curr.data);
        }
        while(curr!=null){
            if(curr.right!=null){
                curr=curr.right;
            }else{
                curr=curr.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
        
    }
    public static void addLeaves(Node root,List<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null){
            addLeaves(root.left, res);
        }
        if(root.right!=null){
            addLeaves(root.right, res);
        }

    }

    public static List<Integer> Printleaves(Node root){
       List<Integer> res=new ArrayList<>();
       if(root==null){
        return res;
       }  
       if(!isLeaf(root)){
        res.add(root.data);
       }

       addLeftboundary(root, res);
       addLeaves(root, res);
       addRightboundary(root, res);
       return res;
      }
    public static void main(String args[]){
      Node root=new Node(1);
      root.left=new Node(2);
      root.left.left=new Node(3);
      root.left.right=new Node(4);
      root.left.right.left=new Node(5);
      root.left.right.right=new Node(6);
      root.right=new Node(8);
      root.right.left=new Node(9);
      root.right.left.right=new Node(10);
      List<Integer> ans=Printleaves(root);
      for(Integer val:ans){
        System.out.print(val +" ");
      }
      System.out.println();
    }
}