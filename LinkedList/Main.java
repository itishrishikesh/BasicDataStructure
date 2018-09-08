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