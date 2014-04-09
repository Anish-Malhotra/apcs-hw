//By Anish M and Dmitriy K

public class MyStack{
    private String[] schtack;
    private int top,numElts;

    //constructor1
    public MyStack(){
	numElts = 0;
	schtack = new String[10];
	top = -1;
    }
    
    //push2
    public void push(String s){
	numElts++;
	if(numElts >= schtack.length){
		String[] tmpArray = new String[schtack.length + (schtack.length/2)];
		for (int i = 0;i<schtack.length;i++){
			tmpArray[i] = schtack[i];
		} 
		schtack = tmpArray;
	}
	top++;
	schtack[top] = s;
    }

    //pop
    public String pop(){
	numElts--;
	top--;
	return schtack[top+1];
    }
    
    //peek
    public String peek(){
	return schtack[top];
    }
    
    //isEmpty
    public boolean isEmpty(){
	return top==-1;
    }
    
    public int getSize(){
	return numElts;
    }
    
    //toString3
    public String toString(){
	return Arrays.toString(schtack);
    }
}

