package main.Tree;

public class BinarySearchTree {

    private Node root;
    private int size = 0;
    private Node smallestNode;

    public BinarySearchTree() {
        root = null;
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
        return smallestNode.key;
    }

    public int extractMin(){
        if (size == 0){
            throw new IndexOutOfBoundsException("Tree is empty");
        }
        int min = smallestNode.key;
        smallestNode = successor(smallestNode);
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


    private int left(int i){
        return (i * 2) + 1;
    }

    private int right(int i){
        return (i * 2) + 2;
    }

    public int[] toArray(){
        // convert binary tree to array
        int[] array = new int[100];
        int index = 0;
        Node node = root;
        while (node != null){
            array[index] = node.key;
            index = left(index);
            node = node.left;
        }

        index = 2;
        node = root;
        while (node != null){
            array[index] = node.key;
            index = right(index);
            node = node.right;
        }

        return array;

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


