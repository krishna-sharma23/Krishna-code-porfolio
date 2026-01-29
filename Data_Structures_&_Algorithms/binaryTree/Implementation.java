package binaryTree;

import java.util.*;


class node{
	int data;
	node left;
	node right;
	
	node(int x){
		this.data = x;
		this.left = null;
		this.right = null;
	}
	
	node(int x, node left, node right){
		this.data = x;
		this.left = left;
		this.right = right;
	}
}

class BinaryTree{
	int idx = -1;
	node buildTree(int[] nodes) {
		idx++;
		if(nodes[idx] == -1) return null;
		
		node newNode = new node(nodes[idx]);
		newNode.left = buildTree(nodes);
		newNode.right = buildTree(nodes);
		
		return newNode;
	}
	
	void preOrder(node root) {
		if(root == null) return;
		System.out.print(root.data + "->");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	void inOrder(node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data + "->");
		inOrder(root.right);
	}
	
	void postOrder(node root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + "->");
	}
	
	void levelOrder(node root) {
		Queue<node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			node temp = q.remove();
			if(temp == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(temp.data + " ");
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null) q.add(temp.right);
			}
		}
	}
}

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		BinaryTree tree = new BinaryTree();
		node root = tree.buildTree(nodes);
		tree.levelOrder(root);
	}

}
