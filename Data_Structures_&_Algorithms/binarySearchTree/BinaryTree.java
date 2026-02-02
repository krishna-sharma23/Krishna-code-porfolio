package binarySearchTree;

import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int x){
		this.data = x;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree{
	Node root;
	
	BinaryTree(){
		this.root = null;
	}
	
	public void insert(int val) {
		root = insertRec(root, val);
	}

	private Node insertRec(Node node, int val) {
		if(node == null) {
			return new Node(val);
		}
		if(val < node.data) {
			node.left = insertRec(node.left, val);
		}
		else if(val > node.data) {
			node.right = insertRec(node.right, val);
		}
		return node;
	}
	
	public void preorder() {
		preorderRec(root);
		System.out.println();
	}

	private void preorderRec(Node node) {
		if(node != null) {
			System.out.print(node.data + " ");
			preorderRec(node.left);
			preorderRec(node.right);
		}
		
	}
	
	public void inorder() {
		inorderRec(root);
		System.out.println();
	}

	private void inorderRec(Node node) {
		if(node == null) {
			return;
		}
		inorderRec(node.left);
		System.out.print(node.data + " ");
		inorderRec(node.right);
		
	}
	
	public boolean search(int key) {
		return searchRec(root, key);
	}

	private boolean searchRec(Node node, int key) {
		if(node == null) return false;
		
		if(node.data == key) return true;
		
		if(node.data < key) return searchRec(node.right, key);
		else return searchRec(node.left, key);
	}
	
	public void delete(int val) {
		deleteRec(root, val);
	}

	private Node deleteRec(Node root, int val) {
		if(root.data > val) root.left = deleteRec(root.left, val);
		else if(root.data < val) root.right = deleteRec(root.right, val);
		else { //when root.data == val
			//Case 1
			if(root.left == null && root.right == null) {
				return null;
			}
			//Case 2
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			//Case 3
			Node IS = inorderSucessor(root.right);
			root.data = IS.data;
			root.right = deleteRec(root.right, IS.data);
		}
		return root;
	}

	private Node inorderSucessor(Node root) {
		while(root.left != null) root = root.left;
		return root;
	}
	
	public void printInRange(int low, int high) {
		print(root, low, high);
	}

	private void print(Node root, int low, int high) {
		if(root == null) return;
		
		if(root.data >= low && root.data <= high) {
			print(root.left, low, high);
			System.out.print(root.data + " ");
			print(root.right, low, high);
		}
		else if(root.data < low) print(root.right, low, high);
		else print(root.left, low, high);
	}
	
	public void printRoot2leaf() {
		Root2Leaf(root, new ArrayList<>());
	}

	private void Root2Leaf(Node root, ArrayList<Integer> path) {
		if(root == null) return;
		
		path.add(root.data);
		
		if(root.left == null && root.right == null) {
			printPath(path);
		}
		else {
			Root2Leaf(root.left, path);
			Root2Leaf(root.right, path);
		}
		path.remove(path.size() - 1);
	}

	private void printPath(ArrayList<Integer> path) {
		for(int i = 0; i < path.size(); i++) {
			System.out.print(path.get(i) + "->");
		}
		System.out.println();
	}
	
	
}