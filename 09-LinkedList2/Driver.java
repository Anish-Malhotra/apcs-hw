public class Driver{
    public static void main(String[] args){
	Node h1;
	
	/*N1 = new Node("Stuff");
	System.out.println(N1);
	
	Node n2 = new Node("ffuts");
	System.out.println(n2);
	N1.setNext(n2);
	System.out.println(N1.getNext());
	n2.setNext( new Node("Clyde"));
	System.out.println(N1.getNext().getNext());
	*/
	
	myLinkedList L = new myLinkedList();
	L.myLinkedList();
	
	
	L.add("one");
	
	
	L.add("two");
	
	
	L.add("three");
	
	
	L.add("four");
	
			
	L.add(2,"String");
	
	Node t = L.getHead();
	for (int i = 0; i < L.length();i++){
	    
	    System.out.println(t);
	    t = t.getNext();
	}
	
	L.remove(2);
	
	
    
    }
}
