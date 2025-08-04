package datastructures.bst;

import data.TreeNode;

public class BinarySearchTree {
    public TreeNode root;

    public BinarySearchTree() {}

    public BinarySearchTree(int value) {
        root = new TreeNode(value);
    }

    // indica si un valor se encuentra en el BST
    public boolean contains(int value) {
        // if (root == null) return false; // si root esta vacio -> false
        TreeNode temp = root; // variable para moverse por el BST
        // mientas temp no sea nulo
        while (temp != null) {
            // caso 1: valor menor a temp
            if (value < temp.value) {
                // moverse a la izquierda
                temp = temp.left;
            } else if (value > temp.value) {
                // caso 2: valor mayor a temp
                // moverse a la derecha
                temp = temp.right;
            } else {
                // si no es ni mayor ni menor, entonces temp es el valor que buscamos
                return true;
            }
        }
        // si llegó aquí es porque temp fue nulo al no encontrar nada
        return false;
    }

    public boolean insert(int value) {
        // crear un nuevo nodo
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return true; // si root esta vacio, entonces el nuevo nodo es ahora root
        }
        TreeNode temp = root; // variable para moverse por el BST

        while (true) {
            if (newNode.value == temp.value) return false; // indica que el valor del nodo ya existe en el BST

            // moverse a la izquierda?
            if (newNode.value < temp.value) {
                // está vacio?
                if (temp.left == null) {
                    temp.left = newNode; // poner nuevo nodo ahi
                    return true;
                }
                // si no lo está, cambiarse al nodo izquierdo
                temp = temp.left;
            } else { // moverse a la derecha
                // está vacio?
                if (temp.right == null) {
                    temp.right = newNode; // poner nuevo nodo en la derecha
                    return true;
                }
                // si no lo está, cambiarse al nodo derecho
                temp = temp.right;
            }
        }
    }

    public TreeNode getRoot() {
        return root;
    }
}
