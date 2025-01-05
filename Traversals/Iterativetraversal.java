//iterative approach using stack and array
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
class Iterativetraversal{
    public static List<Integer> Iterativepreorder(Node root){
        List<Integer> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        Stack<Node> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node node=s.peek();
            arr.add(node.data);
            if(node.right!=null){
                s.push(node.right);
            }
            if(node.left!=null){
                s.push(node.left);
            }
        }
        return arr;
    }

    public static void main(String args[]){

    }
}