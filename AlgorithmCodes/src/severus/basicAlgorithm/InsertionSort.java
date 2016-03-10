package severus.basicAlgorithm;
/**
 * 
 * @author severus
 * insertionSort:
 * 无序区向有序区插入
 */
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,5,2,3};
		int n=6;
		insertionSort(A,n);
		for(int i:A){
			System.out.println(i);
		}
	}
	public static int[] insertionSort(int[] A,int n){
		int tmp;
		for(int i=1;i<n;i++){
			for(int j=i;j>0;j--){
				if(A[j]<A[j-1]){
					tmp=A[j];
					A[j]=A[j-1];
					A[j-1]=tmp;
				}				
			}			
		}
		return A;		
	}

}
