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
		stack.printStack();
	
	}
}
