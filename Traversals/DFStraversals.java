import java.util.*;
class DFStraversals{
    public static void Preorder(Node root,List<Integer> arr){
        if(root==null){
            return ;
        }
        arr.add(root.data);
        Preorder(root.left,arr);
        Preorder(root.right,arr);
    }
    public static List<Integer> Preordertraversal(Node root){
        List<Integer> arr=new ArrayList<>();
        Preorder(root, arr);
        return arr;
    }
    public static void Inorder(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        Inorder(root.left, arr);
        arr.add(root.data);
        Inorder(root.right, arr);
    }
    public static List<Integer> Inordertraversal(Node root){
        List<Integer> arr=new ArrayList<>();
        Inorder(root, arr);
        return arr;
    }
    public static void Postorder(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        Postorder(root.left, arr);
        Postorder(root.right, arr);
        arr.add(root.data);
    }
    public static List<Integer> Postordertraversal(Node root){
        List<Integer> arr=new ArrayList<>();
        Postorder(root, arr);
        return arr;
    }
    public static void main(String args[]){
      Node root=new Node(5);
      root.left=new Node(4);
      root.right=new Node(7);
      root.left.left=new Node(2);
      root.left.right=new Node(3);
      root.right.left=new Node(6);
      root.right.right=new Node(8);
       
      System.out.println("Inorder traversal");
      List<Integer> ans1=Inordertraversal(root);
      for(Integer val:ans1){
        System.out.print(val);
      }
      System.out.println();
      
      System.out.println("Preorder traversal");
      List<Integer> ans2=Preordertraversal(root);
      for(Integer val:ans2){
        System.out.print(val);
      }
      System.out.println();

      System.out.println("Postrder traversal");
      List<Integer> ans3=Postordertraversal(root);
      for(Integer val:ans3){
        System.out.print(val);
      }
      System.out.println();


    }
}