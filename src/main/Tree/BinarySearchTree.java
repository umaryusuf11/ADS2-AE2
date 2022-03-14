package main.Tree;

public class BinarySearchTree {

    private Node root;
    private int size = 0;
    private Node smallestNode;

    public BinarySearchTree() {
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
            root.successor = successor(root);
            smallestNode = root;
            return;
        }
        if(node.key > value){
            if(node.left == null){
                Node newNode = new Node(value, node);
                node.left = newNode;
                recalculateSuccessors(newNode);

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
                recalculateSuccessors(node.right);
                return;
            }
            insert(node.right, value);
            return;
        }
    }

    /**
     * Recalculates the successor of a given node and all of its parents up to the root
     * @param node - the start node of the operation
     */
    private void recalculateSuccessors(Node node){
        if (node.parent == null){
            node.successor = successor(node);
            return;
        }

        node.successor = successor(node);

        recalculateSuccessors(node.parent);
    }

    public int min(){
        return smallestNode.key;
    }

    public int extractMin(){
        if (size == 0){
            throw new IndexOutOfBoundsException("Tree is empty");
        }
        int min = smallestNode.key;
        transplant(smallestNode, smallestNode.right);
        smallestNode = smallestNode.successor;
        size--;
        return min;
    }

    private Node minimum(Node node){
        while (node.left != null){
            node = node.left;
        }
        return node;
    }

    private Node successor(Node node){
        if (node.right != null){
            return minimum(node.right);
        }
        Node parent = node.parent;
        while (parent != null && node == parent.right){
            node = parent;
            parent = parent.parent;
        }
        return parent;
    }

    private class Node {
        int key;
        Node left;
        Node right;
        Node parent;
        Node successor;

        private Node(int value) {
            this.key = value;
            this.successor = successor(this);
        }

        private Node(int value, Node parent){
            this.key = value;
            this.parent = parent;
            this.successor = successor(this);
        }
    }
}


