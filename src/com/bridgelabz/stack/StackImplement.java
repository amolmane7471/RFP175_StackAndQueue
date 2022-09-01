package com.bridgelabz.stack;
import com.bridgelabz.stack.LinkedListStack.Node;

public class StackImplement {
		int top = -1;
		Node head = null;
		LinkedListStack list = new LinkedListStack();
		
		public void push(int data) {
			head = list.insertFirst(data);
			top++; //inserting an element to the stack top will be incremented by 1.
		}
		public Node pop() {
			top--; //after removing element top is decremented by 1
			return list.pop();
		}
		public void printStack() {
			if(top == -1) //check for stack is empty 
			{	
			System.out.println("\nStack is Empty!");
			}
			System.out.println("Top is : "+top);//indicates Top position.
			list.displayLinkedList();
			}
}
