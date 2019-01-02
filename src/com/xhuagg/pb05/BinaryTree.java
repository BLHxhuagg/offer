package com.xhuagg.pb05;

public class BinaryTree {

	private BinaryTreeNode root = null;
	
	public BinaryTree() {
		
	}
	
	public void insert(int data) {
		if(root == null) {
			root = new BinaryTreeNode(data);
		} else {
			BinaryTreeNode node = new BinaryTreeNode(data);
			BinaryTreeNode p = root;
			BinaryTreeNode n = data>p.getData()?p.right:p.left;
			
			while(n != null) {
				p = n;
				n = data>p.getData()?p.right:p.left;
			}
			
			if(data > p.getData())
				p.right = node;
			else
				p.left = node;
		}
	}
	
	public void firstOrderTravesal() {
		firstOrderTravesal0(root);
		System.out.println();
	}
	private void firstOrderTravesal0(BinaryTreeNode n) {
		if(n == null)
			return;
		System.out.print(n.getData() + " ");
		firstOrderTravesal0(n.left);
		firstOrderTravesal0(n.right);
	}
	
	
	public void inOrderTravesal() {
		inOrderTravesal0(root);
		System.out.println();
	}
	private void inOrderTravesal0(BinaryTreeNode n) {
		if(n == null)
			return;
		inOrderTravesal0(n.left);
		System.out.print(n.getData() + " ");
		inOrderTravesal0(n.right);
	}
	
	
	public void postOrderTravesal() {
		postOrderTravesal0(root);
		System.out.println();
	}
	private void postOrderTravesal0(BinaryTreeNode n) {
		if(n == null)
			return;
		postOrderTravesal0(n.left);
		postOrderTravesal0(n.right);
		System.out.print(n.getData() + " ");
	}

}
