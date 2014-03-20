public class MyLinkedList {

    /* Generally speaking there weren't
       too many issues for me here.

       More than anything it was "iterating"
       through the Linked List in the add/remove methods.

       Will try to fix after we clarify in class.

    */

    private Node head;

    public MyLinkedList() {
	head = null;
    }

    public void add(String s) {
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
    }

    //this took an absurdly long time
    //for some reason
    public String toString() {
	String s;
	s = head.toString();
	Node g = head.getNext();
	while (g != head) {
	    s= s + g.toString();
	    g = g.getNext()
		}
	return s;
    }

    //pre-implemented
    public void add (int i, String s) {
	//add at location i, 0 if at front
	//error if adding past the end
	int count;
	//keep counting next until i == count, then add
	//how can implement if there are more afterwards
    }

    public String get(int i) {
	Node current = head;
	int count = 0;
	while (count != i) { 
		current = current.getNext();
		count++;
		}
	return current.getData();
    }

    public String set(int i, String s) {
		String old = "";
		if (i == 0) {
			old = head.getData();
			head.setData(s);
		}
		Node current = head;
		int count;
		while (count != i - 1) {
			current = current.getNext();
			count++;
		}
		old = current.getData();
		current.setData(s);
		return old;
    }


    //shifting everything over causes issues with
    //head so I commented it out
    public String remove(int i) {
		if (i == 0) {
			head = head.getNext();
		}
		Node current = head;
		int count;
		while (count != i - 1) {
			current = current.getNext();
			count++;
		}
		current.setNext((current.getNext()).getNext());
		//doesn't work on head
    }

    public int find (String s) {
		Node current = head;
		int count;
		while ((current.getData() != s) && count < length())  {
			current.getNext();
			count++;
		}
		if (current.getData == s) {
			return count;
			}
		else {
			return -1;
		}
    }

    public int length() {
	int count;
	Node current = head.getNext();
	while (current != head) {
	    count++;
	    current = current.getNext();
	}
	return count;
    }
}