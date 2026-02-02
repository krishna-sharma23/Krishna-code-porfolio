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

class TreeInfo{
	int ht;
	int dia;
	
	TreeInfo(int height, int diameter){
		ht = height;
		dia = diameter;
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
	
	int countNodes(node root) {
		if(root == null) return 0;
		
		int leftNodes = countNodes(root.left);
		int rightNodes = countNodes(root.right);
		
		return leftNodes + rightNodes + 1;
	}
	
	int SumofNodes(node root) {
		if(root == null) return 0;
		
		return root.data + SumofNodes(root.left) + SumofNodes(root.right);
	}
	
	int heightOfTree(node root) {
		if(root == null) {
			return 0;
		}
		
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);
		
		int myHeight = Math.max(leftHeight, rightHeight) + 1;
		
		return myHeight;
	}
	
	//Finding the diameter
	//Approach 1
	int diameter1(node root) {
		if(root == null) {
			return 0;
		}
		
		int dia1 = diameter1(root.left);
		int dia2 = diameter1(root.right);
		int dia3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;
		
		int mydia = Math.max(dia3, Math.max(dia2, dia1));
		
		return mydia;
	}
	
	//Approach 2
	TreeInfo diameter2(node root) {
		if(root == null) {
			return new TreeInfo(0, 0);
		}
		
		TreeInfo left = diameter2(root.left);
		TreeInfo right = diameter2(root.right);
		
		int myHeight = Math.max(left.ht, right.ht) + 1;
		int dia1 = left.dia;
		int dia2 = right.dia;
		int dia3 = left.ht + right.ht + 1;
		
		int myDia = Math.max(dia3, Math.max(dia2, dia1));
		
		return new TreeInfo(myHeight, myDia);
		
	}
}

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		BinaryTree tree = new BinaryTree();
		node root = tree.buildTree(nodes);
//		tree.levelOrder(root);
		System.out.println(tree.diameter2(root).dia);
		System.out.println(tree.diameter2(root).ht);
	}

}
