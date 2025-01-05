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


class Ceil{
    public static int Findceil(Node root,int key){
        int ceil=-1;
        while(root!=null){
          if(root.data==key){
            ceil=root.data;
            return ceil;
          }
          if(key>root.data){
            root=root.right;
          }else{
            ceil=root.data;
            root=root.left;
          }
        }
        return ceil;
    }
    public static void main(String args[]){
      Node node=new Node(7);
      node.left=new Node(2);
      node.left.left=new Node(1);
      node.left.right=new Node(5);
      node.right=new Node(9);
      node.right.left=new Node(8);
      int ans=Findceil(node,4);
      System.out.println("ans is:"+ans);
    }
}