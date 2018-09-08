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
		if(head ==  null) return false;
		if(head.data == x){
			if(head.next != null)
				head = head.next;
			else 
				head = null;
			return true;
		}
		Node parent = head;
		while(parent.next != null){
			if(parent.next.data == x){
				parent.next = parent.next.next;
				return true;
			} 
			parent = parent.next;
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