//stack implement in java program in inheritane concept of interface 
interface stack{
	public void push(int e);
	public int pop();
	public int peak();
	public boolean isEmpty();
	public boolean isfull();
}
class MyStack implements stack{
	private int top;
	private int[] S;
	
	public MyStack(int size){
		this.top=-1;
		this.S=new int[size];
	}
	public boolean isEmpty(){
		if(this.top==-1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isfull(){
		if(top==(S.length-1)){
			return true;
		}
		else{
			return false;
		}
	}
	public int peak(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		else{
			return (this.S[this.top]);
		}
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return -1;
		}
		else{
			return (this.S[this.top--]);
		}
	}
	public void push(int x){
		if(isfull()){
			System.out.println("Stack overflow");
		}
		else{
			S[++this.top]=x;
		}
	}
}
class StackMain{
	public static void main(String[] args){
		MyStack obj=new MyStack(10);
		if(!obj.isfull())
			obj.push(15);
	
		System.out.println("top item = "+obj.peak());
	}
}