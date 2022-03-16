package main.Queue;

public class MinPriorityQueueBST {

    private Node root;
    private int size = 0;
    private Node smallestNode;

    public MinPriorityQueueBST() {
        root = null;
    }

    public void transplant(Node u, Node v){
        if (u.parent == null){
            root = v;
        }
        else if (u == u.parent.left){
            u.parent.left = v;
        }
        else {
            u.parent.right = v;
        }
        if (v != null){
            v.parent = u.parent;
        }
    }

    public void insert(int value) {
        insert(root, value);
        size++;
    }

    private void insert(Node node, int value){
        if (root == null){
            root = new Node(value);
            smallestNode = root;
            return;
        }
        if(node.key > value){
            if(node.left == null){
                Node newNode = new Node(value, node);
                node.left = newNode;
                // check if new node is the smallest node, if so, update smallest node
                if (newNode.key < smallestNode.key){
                    smallestNode = newNode;
                }
                return;
            }
            insert(node.left, value);
            return;
        }
        else {
            if (node.right == null){
                node.right = new Node(value, node);
                return;
            }
            insert(node.right, value);
            return;
        }
    }

    public int min(){
        if (size == 0){
            throw new IndexOutOfBoundsException("Tree is empty");
        }
        return minimum(root).key;
    }

    public int extractMin(){
        if (size == 0){
            throw new IndexOutOfBoundsException("Tree is empty");
        }
        Node min = minimum(root);
        transplant(min, min.right);
        size--;
        return min.key;
    }

    private Node minimum(Node node){
        while (node.left != null){
            node = node.left;
        }
        return node;
    }

    private class Node {
        int key;
        Node left;
        Node right;
        Node parent;

        private Node(int value) {
            this.key = value;
        }

        private Node(int value, Node parent){
            this.key = value;
            this.parent = parent;
        }
    }
}