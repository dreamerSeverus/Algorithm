package severus.basicAlgorithm;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A={1,2,3,5,2,3};
		int n=6;
		mergeSort(A,n);
		for(int i:A){
			System.out.println(i);
		}
	}
	public static int[] mergeSort(int[] A,int n){		
		int [] array=new int[A.length];
		mergeSort(A,0,A.length-1,array);
		return A;
	}
	public static void mergeSort(int[] A,int left,int right,int[] array){
		if(left<right){
			int middle=(left+right)/2;
			mergeSort(A,left,middle,array);
			mergeSort(A,middle+1,right,array);
			merge(A,left,middle,right,array);
		}				
	}
	public static void merge(int[] A,int left, int middle,int right,int[] array){
		int index=0;
		int i=left;
		int j=middle+1;
		while(i<=middle&&j<=right){
			if(A[i]<=A[j]){
				array[index++]=A[i++];
			}else{
				array[index++]=A[j++];
			}		
		}
		while(i<=middle){
			array[index++]=A[i++];
		}
		while(j<=right){
			array[index++]=A[j++];
		}
		for(i=0;i<index;i++){
			A[left+i]=array[i];
		}
	}
}
