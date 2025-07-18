public class buildbst {
  
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }

    // Insert method inside Node class
    public static Node insert(Node root, int val) {
      if (root == null) {
        root = new Node(val);
        return root;
      }
      if (root.data > val) {
        root.left = insert(root.left, val);
      } else {
        root.right = insert(root.right, val);
      }
      return root;
    }
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String args[]) {
    int value[] = {5, 1, 3, 4, 2, 7};
    Node root = null;

    for (int i = 0; i < value.length; i++) {
      root = Node.insert(root, value[i]);  // Corrected call
      inorder(root);                       // Print current tree after each insert
      System.out.println();
    }
  }
}
