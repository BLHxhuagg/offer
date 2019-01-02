package com.xhuagg.pb07;

import java.util.Stack;

public class Queue {
	
	private Stack<Integer> stackPush;
	private Stack<Integer> stackPop;
	
	public Queue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}
	
	public void add(int data) {
		if(stackPush.isEmpty()) {
			while(stackPop.isEmpty() == false) {
				stackPush.push(stackPop.pop());
			}
		}
		stackPush.push(data);
	}
	
	public Integer dequeue() {
		if(stackPop.isEmpty()) {
			while(stackPush.isEmpty() == false) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}

}
