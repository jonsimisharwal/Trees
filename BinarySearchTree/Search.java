class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Search {
    public static boolean Searchnode(Node root, int key) {
        if (root == null) {
            return false;
        }
        while (root != null) {
            if (root.val == key) {
                return true;
            }
            root = root.val > key ? root.left : root.right;
        }
        return false;
    }

    public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.right = new Node(4);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1); // Fix: Add 1 as a child of 2
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        boolean ans = Searchnode(root, 10);
        System.out.println("Searching key exist or not? " + ans);

        ans = Searchnode(root, 4);
        System.out.println("Searching key exist or not? " + ans);
    }
}
