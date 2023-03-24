package binarySearchTree;

import java.util.ArrayList;

public class BST_Operations {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;

        }
    }
    // insertion
    static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.val > val) {
            root.left = insert(root.left, val);
        }

        if (root.val < val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    // search
    static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val > val) {
            return search(root.left, val);
        }

        else if (root.val < val) {
            return search(root.right, val);
        }

        return true;
    }

    // delete
    static Node delete(Node root, int val) {
        if (root.val > val) {
            root.left = delete(root.left, val);
        }
        else if (root.val < val) {
            root.right = delete(root.right, val);
        }
        else { // root.val == val
            // 1 case- no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // 2 case-single child
            if (root.right == null) {
                return root.left;
            }
            if (root.left == null) {
                return root.right;
            }

            // 3 case-not found in above two
            Node IS = inorderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }

        return root;
    }

    static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;

    }

    static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }

        if (root.val >= x && root.val <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.val + " ");
            printInRange(root.right, x, y);
        }

        else if (root.val >= y) {
            printInRange(root.left, x, y);
        }
        else {
            printInRange(root.right, x, y);
        }
    }

    static void printRoot2Leaf (Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        // printing path
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size() - 1);

    }

    static void printPath(ArrayList<Integer> path) {
        for (int val : path) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nodes = {5,1,3,4,2,7};
        Node root = null;

        for (int i : nodes) {
            root = insert(root, i);
        }

        inOrder(root);
        System.out.println(search(root, 5));

        delete(root,1);
        inOrder(root);
        System.out.println();

        printInRange(root, 7,8);
        System.out.println();

        printRoot2Leaf(root, new ArrayList<>());
    }
}
