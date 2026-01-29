package binarySearchTree;

public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.insert(5);
		tree.insert(4);
		tree.insert(6);
		tree.insert(3);
		tree.insert(7);
		tree.insert(8);
		tree.preorder();
		tree.inorder();
		System.out.println(tree.search(7));
	}

}
