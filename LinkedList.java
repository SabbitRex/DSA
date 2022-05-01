package com.test.java;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	Node current = null;
	
	Node head = null;
	
	List<Node> data = new ArrayList<Node>();
	
	public void addAtBack(String nodeName) {
		
		if (head == null) {
			
			Node node = new Node(nodeName, null, null);
			
			this.current = node;
			this.head = node;
			this.data.add(node);
			
		} else if (current != null) {
			
			Node node = new Node(nodeName, null, this.current);
			
			this.data.get(this.data.indexOf(this.current)).next = node;
			
			this.current = node;
			
			this.data.add(node);	
		}
	}
	
	public void removeFromBack(String nodeName) {
		
		
	}
	
	public void printLinkedList() {
		
		for (Node node : this.data) {
			
			String previous = null;
			String next = null;
			
			if (node.previous != null) {
				previous = node.previous.nodeName;
			}
			
			if (node.next != null) {
				next = node.next.nodeName;
			}
			
			System.out.print("Previous : " + previous);
			System.out.print(", Value : " + node.nodeName);
			System.out.print(", Next : " + next);
			
			System.out.println();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		LinkedList list = new LinkedList();
		
		list.addAtBack("Sharad");
		list.addAtBack("Devashree");
		list.addAtBack("Trident");
		
		list.printLinkedList();
	}
}

class Node {
	
	String nodeName;
	Node next;
	Node previous;
	
	public Node(String nodeName, Node next, Node previous) {
		
		this.nodeName = nodeName;
		this.next = next;
		this.previous = previous;
	}
}
