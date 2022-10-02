import java.util.Scanner;

public class Tree {

    static Scanner scanner = null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

        System.out.println("this is the height of our tree " + getHeightTree(root));

    }

    static Node createTree() {
        System.out.println("Enter a number Here");
        int data = scanner.nextInt();
        Node root = null;

        if (data == -1) return null;

        root = new Node(data);

        System.out.println("enter the values for the left part of " + data);
        root.left = createTree();

        System.out.println("enter the values for the right part of " + data);
        root.right = createTree();

        return root;
    }

    // get the maximum value of all nodes
    // space complexity is O(h) : h is the height of tree
    // time complexity is O(n) : we pass on each node once !
    static int getMaximumNode(Node root) {
        if (root == null) return -1;
        return Math.max(root.data, Math.max(getMaximumNode(root.left), getMaximumNode(root.right)));
    }

    static int getHeightTree(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(getHeightTree(root.left), getHeightTree(root.right)) + 1;

    }

    // get the number of nodes in a tree
    static int getSizeTree(Node root) {
        if (root == null) {
            return 0;
        }

        return getSizeTree(root.left) + getSizeTree(root.right) + 1;

    }

    static void inOrder(Node root) {

        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

}

class Node {
    Node right, left;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
