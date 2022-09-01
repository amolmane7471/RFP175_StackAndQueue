package com.bridgelabz.stack;
/*
 * purpose : implement stack and queue data structre using linked list
 * @uthor : Amol
 * since : 2022/08/31
 */
public class StackAndQueueMain {
	public static void main(String[] args) {
	System.out.println("*** Welcome to stack and queue data structure ***");
	
		/*
		 * UC1 : Ability to create a Stack of 56->30->70
		 * object created Stack 
		 */
		StackImplement stack=new StackImplement();
		stack.push(70); //add 70 to the bottom of stack  
		stack.push(30); //add 30 over the 70
		stack.push(56); //add 56 top of the stack
		stack.printStack(); //56 30 70
		
		/*
		 * UC2 : program to peak and pop from stack till it is empty
		 * use Linked list to do the stack operations
		 * push for inserting element
		 * pop for delete element
		 */
		stack.pop(); //56
		stack.printStack();// 30 70
		stack.pop(); //30
		stack.printStack();//70
		stack.pop();//70
		stack.printStack();//stack is empty
	}
}
