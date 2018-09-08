public class Queue{
	int queue[];
	int front, rear=-1, size;
	public Queue(int size){
		this.size = size;
		queue = new int[size];
	}
	public int peek(){
		return queue[front];
	}
	public boolean isFull(){
		if(rear == size-1) 
			return true;
		else
			return false;
	}
	public boolean isEmpty(){
		if(front < 0 || front > rear)
			return true;
		else 
			return false;
	}
	public boolean enqueue(int value){
		if(isFull())
			return false;
		else{
			queue[++rear] = value;
			return true;
		}
	}
	public int deQueue(){
		if(isEmpty())
			return -1;
		else{
			return queue[front++];
		}
	}
}