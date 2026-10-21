package Lists;
class Node{
	int data;
	Node next;  //Since, it has to represent the next node. Its data type is Node.
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList {
	public static void main(String args[]) {
		Node p1 = new Node(10);
		Node p2 = new Node(20);
		Node p3 = new Node(30);
		Node p4 = new Node(40);
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		Node head = p1;
	}
}
