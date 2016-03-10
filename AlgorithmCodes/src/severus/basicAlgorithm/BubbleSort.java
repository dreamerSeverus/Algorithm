package severus.basicAlgorithm;

/*
 *BubbleSort:
 * 
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,5,2,3};
		int n=6;
		bubbleSort(A,n);
		for(int i:A){
			System.out.println(i);
		}
	}
	public static int[] bubbleSort(int[] A,int n){
		int tmp=0;
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(A[j]>A[j+1]){
					tmp=A[j+1];
					A[j+1]=A[j];
					A[j]=tmp;
				}
			}
		}		
		return A;
	}
}
