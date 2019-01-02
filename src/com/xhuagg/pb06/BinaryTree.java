package com.xhuagg.pb06;

public class BinaryTree {

	private BinaryTreeNode root = null;
	
	public BinaryTree() {
		
	}
	
	public void reconstruct(int[] first, int[] in) {
		if(first == null || in == null) {
			root = null;
			return;
		} else if(first.length != in.length) {
			root = null;
			return;
		}
		root = reconstruct0(first, 0, first.length-1, in, 0, in.length-1);
		
	}
	private BinaryTreeNode reconstruct0(int[] first, int fstart, int fend, int[] in, int istart, int iend) {
		if(istart > iend)
			return null;
		BinaryTreeNode node = new BinaryTreeNode(first[fstart]);
		int splitIndex = getValueAt(first[fstart], in, istart, iend);
		node.left = reconstruct0(first, fstart+1, fstart+splitIndex-istart, in, istart, splitIndex-1);
		node.right = reconstruct0(first, fstart+splitIndex-istart+1, fend, in, splitIndex+1, iend);
		
		return node;
	}
	private int getValueAt(int v, int[] a, int start, int end) {
		//二叉树可能没有顺序，只能逐个查找
		for(int i = start; i <= end; i++)
			if(a[i] == v)
				return i;
		return -1;
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
