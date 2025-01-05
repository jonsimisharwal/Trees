/* 
Problem statement:->Check if two trees are identical  */
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
class Edenticaltree{
      public static boolean Checktree(Node node1,Node node2){
        if(node1==null&& node2==null){
            return true;
        }
        if(node1==null|| node2==null){
            return false;
        }
        return node1.data==node2.data && Checktree(node1.left, node2.left) && Checktree(node1.right, node2.right);
      }
    public static void main(String args[]){
      Node node1=new Node(1);
      node1.left=new Node(2);
      node1.right=new Node(3);
      node1.left.left=new Node(4);
      node1.left.right=new Node(5);
      Node node2=new Node(1);
      node2.left=new Node(2);
      node2.right=new Node(3);
      node2.left.left=new Node(4);
      node2.left.right=new Node(5);
      boolean ans=Checktree(node1, node2);
      System.out.println("check tree is idential true or false?"+ ans);
    }
}