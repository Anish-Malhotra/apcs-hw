public class myLinkedList{
    private Node head;
    private Node tail;
    private int length = 0;
    
    public void myLinkedList(){
	head = new Node(" ");
	tail = head;
	
    }
    
    public Node getHead(){
	return head;
    }

    public void add(String s){
	Node temp = new Node(s);
	tail.setNext(temp);
	tail = temp;
	length++;
    }
    
    public void add(int i, String s){
	Node newNode = new Node(s);
	
	Node tmp = head;
	while(1 <= i-1){
	    tmp = tmp.getNext();
	    i--;
	}
	newNode.setNext(tmp.getNext());
	tmp.setNext(newNode);
	length++;
    }
    
    public String get(int i){
	Node temp = head;
	for (int j = 1;j < i;j++){
	    temp = temp.getNext();
	}
	return temp.getData();
    }
    
    public String set(int i, String s){
	Node temp = head;
	for (int j = 1;j < i;j++){
	    temp = temp.getNext();
	}
	String old = temp.getData();
	temp.setData(s);
	if (i == length - 1){
	    tail = temp;
	}
	return old;
    }
    
    public String remove(int i){
	Node temp = head;
	for (int j = 1;j < i - 1;j++){
	    temp = temp.getNext();
	}
	String old = temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	length--;
	if (i == length - 1){
	    tail = temp;
	}
	return old;
	
    }
    
    public int find(String s){
	Node temp = head;
	int counter = 1;
	while(temp.getData() != s){
	    if (temp.getNext() == null)
		return -1;
	    counter++;
	    temp = temp.getNext();
	}
	return counter;
    }

    public int length(){
        return length;
    }
    
    public String toString(){
	String s = "";
	s = s + head;
	return s;
    }
    
    
}
