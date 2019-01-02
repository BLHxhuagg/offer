package com.xhuagg.pb06;

public class BinaryTreeNode {
	
	private int data;
	
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode() {
		// TODO Auto-generated constructor stub
		left = null;
		right = null;
	}
	
	public BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
	

}
