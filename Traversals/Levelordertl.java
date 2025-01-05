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
class Levelordertl{
    public static List<List<Integer>> Levelordertraversal(Node root){
     List<List<Integer>> ans=new ArrayList<>();
     Queue<Node> q=new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
        int size=q.size();
        List<Integer> level=new ArrayList<>();
       
        for(int i=0;i<size;i++){
            Node node=q.poll();
            level.add(node.data);
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
        }
        ans.add(level);
     }
     return ans;
    }
    public static void main(String args[]){
  Node root=new Node(1);
  root.left=new Node(2);
  root.right=new Node(3);
  root.left.left=new Node(5);
  root.left.right=new Node(6);
  root.right.left=new Node(7);
  root.right.right=new Node(8);
  List<List<Integer>> ans=Levelordertraversal(root);
  for(List<Integer> val:ans){
    System.out.print(val +" ");
  }
  System.out.println();
    }
}