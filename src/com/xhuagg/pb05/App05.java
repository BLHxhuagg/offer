package com.xhuagg.pb05;

public class App05 {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(15);
		list.insert(18);
		list.insert(2);
		list.insert(96);
		
		list.printList();
		list.printListFromTail();
		
		
		BinaryTree tree = new BinaryTree();
		tree.insert(10);
		tree.insert(6);
		tree.insert(14);
		tree.insert(4);
		tree.insert(8);
		tree.insert(12);
		tree.insert(16);
		
		tree.firstOrderTravesal();
		tree.inOrderTravesal();
		tree.postOrderTravesal();
		
		
		
	}

}
