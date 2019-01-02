package com.xhuagg.pb07;

public class App07 {
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(15);
		q.add(18);
		q.add(66);
		q.add(32);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.add(39);
		q.add(111);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.add(112);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
