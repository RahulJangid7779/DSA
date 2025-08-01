import java.util.*;

public class SpiralTraversal {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    public static void spiralOrder(Node root) {
        if (root == null) return;

        Stack<Node> s1 = new Stack<>(); // For levels: left to right
        Stack<Node> s2 = new Stack<>(); // For levels: right to left

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            // Print nodes from s1 and push children to s2
            while (!s1.isEmpty()) {
                Node node = s1.pop();
                System.out.print(node.data + " ");

                // Push left then right (for next level right to left)
                if (node.left != null) s2.push(node.left);
                if (node.right != null) s2.push(node.right);
            }

            // Print nodes from s2 and push children to s1
            while (!s2.isEmpty()) {
                Node node = s2.pop();
                System.out.print(node.data + " ");

                // Push right then left (for next level left to right)
                if (node.right != null) s1.push(node.right);
                if (node.left != null) s1.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \   \
          7   6   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.right = new Node(5);

        System.out.println("Spiral Order Traversal:");
        spiralOrder(root); // Output: 1 3 2 7 6 5
    }
}
