package com.bridgelabz.stack;
import com.bridgelabz.stack.LinkedListStack.Node;

public class StackImplement {
		int top=-1;
		Node head=null;
		LinkedListStack list=new LinkedListStack();
		
		public void push(int data) {
			head=list.insertFirst(data);
			top++;
		}
		public Node pop() {
			top--;
			return list.pop();
		}
		public void printStack() {
			System.out.println("Top is : "+top);
			list.displayLinkedList();
			}
		

}
