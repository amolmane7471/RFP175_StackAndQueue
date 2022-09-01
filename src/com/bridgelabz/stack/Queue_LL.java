package com.bridgelabz.stack;
class Queue_LL {

	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node front;
	private Node rear;
	private int size;

	public Queue_LL() {
		front = null;
		rear = null;
		size = 0;
	}
	public boolean isEmpty() {
		if (front == null && rear == null)
			return true;
		else 
			return false;
	}

	public int count() {
		return size;
	}

	public void enqueue(int val) {
		Node n = new Node(val);
		if (isEmpty()) {
			front = rear = n;
		} else {
			rear.next = n;
			rear = n;
		}
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return  -1;
		} else if (front == rear) {
			Node delD = front;
			front = rear = null;
			size--;
			return delD.data;
		} else {
			Node delD = front;
			front = front.next;
			delD.next = null;
			size--;
			return delD.data;
		}
	}

	public int peek() {
		
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return front.data;
	}

	public void viewQ() {
		System.out.print("Queue is : ");
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}
		Node t = front;
		while (t != null) {
			
			System.out.print(t.data +"-> ");
			t = t.next;
		}
		System.out.println("  ");
	}
	
}
