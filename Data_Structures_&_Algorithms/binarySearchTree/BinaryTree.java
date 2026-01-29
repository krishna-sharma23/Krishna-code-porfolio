package binarySearchTree;

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
	
}