//Had some issues with this, took the pivot select from Emily

public class QuickSort {

    public int partition( int[] a, int L, int R ) {
	int wall = 0; 
	int p = (int) ( Math.random() * R );
	//System.out.println("Partition at: " + p);
	int temp1 = a[R];
	a[R] = a[p]; 
	a[p] = temp1;
	for ( int i = 0; i < R; i++ ) {
	    if ( a[i] < a[R] ) {
		int temp2 = a[wall];
		a[wall] = a[i];
		a[i] = temp2;
		wall++;
	    }
	}
	int temp3 = a[R];
	a[R] = a[wall];
	a[wall] = temp3;
	//System.out.println(printArray(a));
	return wall;
    }

    public void sort( int[] A, int lo, int hi ) {
	if (A.length-1 <= 1) {
	    return;
	}
	else {
	    int k = partition(A, lo, hi);
	    if ( k-1 > 1 ) 
		qSort(A, 1, k-1);
	    if ( k+1 < hi ) 
		qSort(A, k+1, hi);
	}
    }

    public void sort(int[] A) {
	qSort(A, 0, A.length-1);
    }

    public static void main (String[] args) {
	QuickSort2 s = new QuickSort2();
	int[] test = new int[1000000];
	for (int i = 0; i < test.length; i++)
	    test[i] = ((int)( Math.random()*100));
        s.sort(test);
	System.out.println(Arrays.toString(test));
    }

}