//An integer stack
class Stack{
    private int[] stack;
    private int size, top = -1;
    public Stack(int size){
    	stack = new int[size];
    	this.size = size;
    }
    public int peek(){
    	if(top == -1) return -1;
    	return stack[top];
    }
    public boolean isFull(){
    	if(top+1 >= size){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    public boolean isEmpty(){
    	if(top < 0){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    public void push(int data){
    	if(!isFull()){
    		stack[++top] = data;
    	}
    	else{
    		System.out.println("Stack is full");
    	}
    }
    public int pop(){
    	if(!isEmpty()){
    		return stack[top--];
    	}
    	else{
    		//Stack is Empty
    		return -1;
    	}
    }
}
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