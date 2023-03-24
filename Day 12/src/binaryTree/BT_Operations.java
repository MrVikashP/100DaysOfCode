package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BT_Operations {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;
        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1){
                return null;
            }

            // creating a new node
            Node newNode = new Node(nodes[idx]);

            // call for left part
            newNode.left = buildTree(nodes);

            // call for right part
            newNode.right = buildTree(nodes);

            // return the root
            return newNode;

        }
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        // print root
        System.out.print(root.data + " ");

        // print left
        preorder(root.left);

        // print right
        preorder(root.right);
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        // print left, root, right
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        // print left, right, root
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelOrder(Node root) {
        // BFS property
        // making a queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currNode = queue.remove();

            if (currNode == null) {
                System.out.println();

                if (queue.isEmpty()) {
                    break;
                }
                else {
                    queue.add(null);
                }
            }
            else {
                System.out.print(currNode.data + " ");

                if (currNode.left != null) {
                    queue.add(currNode.left);
                }

                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
    }

    static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int left = countOfNodes(root.left);
        int right = countOfNodes(root.right);

        return left + right + 1;
    }

    static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    static int diameter(Node root) {
        // first find diameter for left - do not pass root
        // second find diameter for right - do not pass root
        // third diameter if that passes the root - left height + right height + 1
        // answer would be the max of it
        if (root == null) {
            return 0;
        }

        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        int ans = Math.max(Math.max(d1,d2),d3);

        return ans;
    }

    static class TreeInfo {
        int height;
        int diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right =diameter2(root.right);

        int myHeight = Math.max(left.height,right.height) + 1;

        int d1 = left.diameter;
        int d2 = right.diameter;
        int d3 = left.height + right.height + 1;

        int myDiameter = Math.max(Math.max(d1,d2),d3);

        return new TreeInfo(myHeight,myDiameter);
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        preorder(root);
        inOrder(root);
        postOrder(root);
        levelOrder(root);

        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));

        System.out.println(diameter(root));
        System.out.println(diameter2(root).diameter);

    }
}
