public class MyStack{
    private Node top;
    private int numElts;
    
    //constructor1
    public MyStack(){
	top = null;
	numElts = 0;
    }
    
    //push2
    public void push(double d){
	if (d != 5537.8008){	
	    Node n = new Node(d);
	    n.setNext(top);
	    top = n;
	    numElts++;
	}else{
	    System.out.println("Not enough information. Please add more\n");
	}
	
    }
    //pop
    public double pop(){
	double s;
	s = top.getData();
	top = top.getNext();
	numElts--;
	return s;
    }
    
    //peek
    public double peek(){
	return top.getData();
    }
    
    //isEmpty
    public boolean isEmpty(){
	return top == null;
    }
    
    public int getSize(){
	return numElts;
    }
    
    public double operand(String op){
	if (op.equals("square")){
	    return this.peek() * this.pop();
	}
        
	if(this.getSize() <= 1)
	    return 5537.8008;
	if (op.equals("+")){
	    double tmp = this.pop();
	    return this.pop() + tmp;
	}
	if (op.equals("-")){
	    double tmp = this.pop();
	    return this.pop() - tmp;
	}
	if (op.equals("*")){
	    double tmp = this.pop();
	    return this.pop() * tmp;
	}
	if (op.equals("/")){
	    double tmp = this.pop();
	    if (this.peek() == 0.0){
		System.out.println("One cannot simply divide by zero\n");
		System.exit(0);
	    }
	    return this.pop() / tmp;
	}
	
	
	
         
	 
	
	System.out.println("There seems to be an error please try again\n");
	return 5537.8008;
    }
    
    public void clearStack(){
	top = null;
	numElts = 0;
    }
    
    //toString3
    public String toString(){
	String tmp = "";
	Node currentNode = top;
	while (currentNode != null){
	    tmp += currentNode.getData() + " ";
	    currentNode = currentNode.getNext();
	    
	}
	return "The stack contains: " + tmp + "\n";
	
    }
}
