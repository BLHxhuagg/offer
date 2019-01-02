package com.xhuagg.pb06;

public class App06 {
	
	public static void main(String[] args) {
		int[] first = new int[] {1, 2, 4, 7, 3, 5, 6, 8};
		int[] in = new int[] {4, 7, 2, 1, 5, 3, 8, 6};
		
		BinaryTree tree = new BinaryTree();
		tree.reconstruct(first, in);
		
		tree.firstOrderTravesal();
		tree.inOrderTravesal();
		tree.postOrderTravesal();
	}

}
