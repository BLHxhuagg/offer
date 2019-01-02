package com.xhuagg.pb05;

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		head = new Node();
		head.next = null;
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		node.next = head.next;
		head.next = node;
	}
	
	public void printList() {
		Node p = head.next;
		while(p != null) {
			System.out.print(p.getData() + " ");
			p = p.next;
		}
		System.out.println();
	}
	
	public void printListFromTail() {
		printListFromTail0(head.next);
		System.out.println();
	}
	
	private void printListFromTail0(Node p) {
		if(p == null)
			return;
		printListFromTail0(p.next);
		System.out.print(p.getData() + " ");
	}
}
