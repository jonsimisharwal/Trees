//To find the maximum depth of the binary tree using level order traversal, 
//we employ a breadth-first approach. Initialise a queue and push the root node.
import java.util.LinkedList;
import java.util.Queue;

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
 class Height{
    public static int Heighttree(Node root){
        //base case
        if(root==null){
            return 0;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int height=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
            Node front=q.poll();
            if(front.left!=null){
                q.add(front.left);
            }
            if(front.right!=null){
                q.add(front.right);
            }
            
        }
        height++;
        }
        return height;
    } 
    public static void main(String args[]){
        Node root=new Node(1);
         root.left=new Node(2);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right=new Node(3);
         int ans=Heighttree(root);
         System.out.println("Maximum height is:"+ans);
    }
}