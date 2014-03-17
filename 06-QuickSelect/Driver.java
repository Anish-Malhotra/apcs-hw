public class Driver{
	public static void main(String[] args){
		int[] test = new int[10000];
		for(int i: test)
			i = ((int)((Math.random)*100));
		Quickselect q = new Quickselect();
		q.sort(test);
		System.out.println(test);
	}
}