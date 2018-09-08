public class Main{
	public static void main(String args[]){
		Stack stack = new Stack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}