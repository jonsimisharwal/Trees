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

class Floor{
    public static int Findfloor(Node root,int key){
        int floor=-1;
        while(root!=null){
          if(root.data==key){
            floor=root.data;
            return floor;
          }
          if(key>root.data){
            floor=root.data;
            root=root.right;
          }else{
            root=root.left;
          }
        }
        return floor;
    }
    public static void main(String args[]){
      Node node=new Node(11);
      node.left=new Node(6);
      node.right=new Node(15);
      node.left.left=new Node(5);
      node.left.right=new Node(9);
      node.right.left=new Node(14);
      node.right.right=new Node(18);
      int ans=Findfloor(node, 4);
      System.out.println("ans is:"+ ans);
    }
}