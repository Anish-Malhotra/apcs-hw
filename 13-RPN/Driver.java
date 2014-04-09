import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	MyStack stack = new MyStack();
	Scanner sc = new Scanner(System.in);
	System.out.println("\nWelcome. To begin simply add numbers and operands\n");
	while(true){
	    
	    String s = sc.nextLine();
	    if (s.equals('3'))
		break;
	    
	    if (s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("square")){
		stack.push(stack.operand(s));
	    } else{
		try{
		    stack.push(Double.parseDouble(s));
		}catch(Exception E){
		    if (s.equalsIgnoreCase("clear")){
			stack.clearStack();
		    }else{
			System.out.println("There seems to have been an error\n");}
		}
	    }
	    System.out.println(stack);
	}
	
	
    }
}
