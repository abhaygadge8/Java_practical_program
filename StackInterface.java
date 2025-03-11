interface Stack
{
public void push(int e);
public int pop();
public int peak();
public int isEmpty();
public int isFull();
}
class MyStack implements Stack
{
private int top;
private int[] s;
public MyStack(int size)
{
this.top = -1;
this.s = new int[size];
}
public int isEmpty()
{
if(this.top == -1)
return 1;
else
return 0;
}
public int isFull()
{
if(top == (s.length -1))
return 1;
else
return 0;
}
public int peak()
{
return (this.s[this.top]);
}
public int pop()
{
return (s[top--]);
}
public void push(int item)
{
	s[++top] = item;
}
}
class StackInterface
{
public static void main(String[] args)
{
MyStack obj = new MyStack(4);
if(obj.isFull() != 1)
obj.push(10);
else
System.out.println("Stack is Full");
if(obj.isEmpty() == 1)
System.out.println("Stack is Empty");
else
System.out.println("Top item = " + obj.peak());
}
}