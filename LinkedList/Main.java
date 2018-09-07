class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
	}
}
class SinglyLinkedList{
	Node head;
	public void insert(int data){
		if(head == null){
			head = new Node(data);
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
	}
	public void insertInFront(int x){
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
	}
	public boolean find(int x){
		Node temp = head;
		while(temp != null && temp.data != x){
			temp = temp.next;
		}
		if(temp.data == x)
			return true;
		else
			return false;
	}
	public boolean delete(int x){
		Node temp = head;
		if(head.data == x){
			if(head.next != null)
				head = head.next;
			else 
				head = null;
			return true;
		}
		while(temp.next != null){
			if(temp.next.data == x){
				temp.next = temp.next.next;
				return true;
			} 
			temp = temp.next;
		}
		return false;
	}
	public void displayAll(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
public class Main{
	public static void main(String args[]){
		SinglyLinkedList sll = new SinglyLinkedList();
		System.out.println("\n**Singly Linked List**\n");
		sll.insert(10);
		sll.insert(20);
		sll.insert(30);
		sll.insert(40);
		System.out.println("Inserted Elements:");
		sll.displayAll();
		System.out.println("Deleting 10");
		if(sll.delete(10)){
			sll.displayAll();
		}
		System.out.println("Deleting 30");
		if(sll.delete(30)){
			sll.displayAll();
		}
		System.out.println("Inserting 11 in front");
		sll.insertInFront(11);
		sll.displayAll();
	}
}