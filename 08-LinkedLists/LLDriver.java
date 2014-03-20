public class LLDriver {

    //Just the generic driver
    //Didn't make any changes here as my testing
    //is buggy because MyLinkedList has some issues
    //with the add and remove methods	

    public static void main(String[] args){
	MyLinkedList L = new MyLinkedList();

	L.add("A");
	System.out.println(L);
	L.add("B");
	System.out.println(L);
	L.add("C");
	System.out.println(L);
	L.add("D");
	System.out.println(L);
	L.add("E");
	System.out.println(L);


    }
}