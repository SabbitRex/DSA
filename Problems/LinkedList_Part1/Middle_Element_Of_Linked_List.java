# https://workat.tech/problem-solving/practice/middle-element-linked-list

class Middle_Element_Of_Linked_List {
	
	int getMiddleElementOfLinkedList(ListNode list) {
		
		ListNode slow = list;
		
		ListNode fast = list;
		
		while (fast.next != null && fast.next.next != null) {
			
			slow = slow.next;
			
			fast = fast.next.next;
		}
		
		return slow.data;
	}
}
