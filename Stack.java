package com.test.java;

import java.util.Arrays;

public class Stack 
{
	int top = -1;
	int maxSize = 0;
	Integer[] array;
	
	public Stack(int size) {
		
		this.maxSize = size;
		this.array = new Integer[this.maxSize];
	}
	
    public void push(int value) {
    	
    	if (this.top == this.maxSize - 1) {
    		
    		System.out.println("Stack is full.");
    		return;
    	}
    	
    	this.array[++top] = value;
    	
    	System.out.println(Arrays.toString(array));
    	System.out.println("New top : " + this.top);
    }
    
    public void pop() {
    	
    	if (this.top == -1) {
    		
    		System.out.println("Stack is empty.");
    		return;
    	}
    	
    	this.array[this.top--] = null;
    	
    	System.out.println(Arrays.toString(array));
    	System.out.println("New top : " + this.top);
    }
    
    public void peek() {
    	
        if (this.top == -1) {
    		
    		System.out.println("Stack is empty.");
    		return;
    	}
        
        System.out.println("Top element : " + this.array[this.top]);
    }
    
    public static void main(String[] args) {
		
    	Stack stack = new Stack(5);
    	
    	stack.peek();
    	stack.push(2);
    	stack.push(3);
    	stack.peek();
    	stack.pop();
    	stack.push(5);
    	stack.push(6);
    	stack.push(7);
    	stack.push(8);
    	stack.push(9);
    	stack.peek();
    	stack.pop();
    	stack.pop();
    	stack.pop();
    	stack.pop();
    	stack.pop();
    	stack.pop();
	}
}