package binarySearchTree;

public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		int[] nodes = {8, 5, 10, 3, 6, 11, 1, 4, 14};
		for(int i : nodes) {
			tree.insert(i);
		}
//		tree.inorder();
//		tree.delete(11);
//		tree.inorder();
//		tree.printInRange(5, 10);
		tree.printRoot2leaf();
	}

}
