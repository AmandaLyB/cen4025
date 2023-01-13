package cen4025;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class BinaryTree {

	Node root;
	
	public void addNode(int key, String name) throws Exception {
		Node newNode = new Node(key, name);
		if(root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				if(key<focusNode.key) {
					focusNode = focusNode.leftChild;
					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if(focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrderTraverseTree(Node focusNode) throws Exception {
		if(focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void preorderTraverseTree(Node focusNode) throws Exception {
		if(focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void postorderTraverseTree(Node focusNode) throws Exception {
		if(focusNode != null) {
			postorderTraverseTree(focusNode.leftChild);
			postorderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	public Node findNode(int key) {
		Node focusNode = root;
		while(focusNode.key != key) {
			if(key < focusNode.key) {
				focusNode = focusNode.leftChild;
			} else {
				focusNode = focusNode.rightChild;
			}
			
			if(focusNode == null)
				return null;
		}
		return focusNode;
	}
	
	public static void main(String[] args) throws Exception {
				
		
		
		BinaryTree tree = new BinaryTree();	
		
		
		tree.inOrderTraverseTree(tree.root);
	}

}

class Node {
	
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name) {
		this.key = key;
		this.name = name;
	}
	
	public String toString() {
		return name + " has a key " + key;
	}
}
