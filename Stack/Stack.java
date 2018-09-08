public class Stack{
    private int[] stack;
    private int size, top = 0;
    public Stack(int size){
    	stack = new int[size];
    	this.size = size;
    }
    public int peek(){
    	if(top == 0) return 0;
    	return stack[top];
    }
    public boolean isFull(){
    	if(top >= size){
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
    		stack[top++] = data;
    	}
    	else{
    		System.out.println("Stack is full");
    	}
    }
    public int pop(){
    	if(!isEmpty()){
    		return stack[--top];
    	}
    	else{
    		System.out.println("Stack is Empty");
    		return -1;
    	}
    }
}
