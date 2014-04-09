public class Driver{
    public static void main(String[] args){
	MyStack stack = new MyStack();
	stack.push("1");
	stack.push("2");
	stack.push("3");
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	stack.push("hello");
	stack.push("world");
	stack.push("6");
	System.out.println(stack);
    }
}
