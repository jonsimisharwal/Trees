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
 class Element{
    public static void Inorder(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        Inorder(root.left, arr);
        arr.add(root.data);
        
        Inorder(root.right, arr);
    }
    public static List<Integer> Findkthelemenet(Node root,int k){
        List<Integer> arr=new ArrayList<>();
        Inorder(root, arr);
        int klargest=arr.get(arr.size()-k);
        int ksmallest=arr.get(k-1);
        return Arrays.asList(ksmallest,klargest);
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(3);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.left.right.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(14);
 
        List kthElements = Findkthelemenet(root,3);

        System.out.println("Kth smallest element: " + kthElements.get(0));
        System.out.println("Kth largest element: " + kthElements.get(1));



    }
}