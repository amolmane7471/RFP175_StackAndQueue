package com.bridgelabz.stack;

public class LinkedListStack {
		public class Node {
			int key;
			Node next;
			public int data;
		
			public int getKey() {
				return key;
			}

			public void setKey(int key) {
				this.key = key;
			}

			public Node getNext() {
				return next;
			}

			public void setNext(Node next) {
				this.next = next;
			}
		}

		Node head;
		
		public Node insertFirst(int data) {
			Node node = new Node();
			node.setKey(data);
			node.setNext(head);
			return head = node;
		}
		
		public void displayLinkedList() {
			Node currentNode = head;
			while (currentNode != null) {
					System.out.println(" ");
				System.out.println("|"+currentNode.getKey()+"|");
				System.out.print("|__| ");
				currentNode = currentNode.next;
				}	

		}

		public Node pop() {
		System.out.print("Popped element:"+head.key);
			head = head.next;
		System.out.println();
			return	head;
		}

}
