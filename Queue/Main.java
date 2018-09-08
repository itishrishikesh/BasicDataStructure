public class Main{
	public static void main(String args[]){
		Queue q = new Queue(5);
		q.enqueue(10);
		q.enqueue(40);
		q.enqueue(30);
		q.enqueue(12);
		q.enqueue(32);

		System.out.println("Dequeueing the data:");

		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}