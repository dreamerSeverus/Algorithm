package severus.basicAlgorithm;

/**
 * 
 * @author severus
 *	selection Sort:
 */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,5,2,3};
		int n=6;
		selectionSort(A,n);
		for(int i:A){
			System.out.println(i);
		}
	}
	public static int[] selectionSort(int[] A,int n){		
		int maxIndex=0;
		int tmp=0;
		for(int i=n-1;i>0;i--){
			maxIndex=i;
			for(int j=0;j<i;j++){
				if(A[j]>A[maxIndex]){
					maxIndex=j;
				}
			}
			if(maxIndex!=i){
				tmp=A[maxIndex];
				A[maxIndex]=A[i];
				A[i]=tmp;
			}			
		}
		return A;
	}
}
