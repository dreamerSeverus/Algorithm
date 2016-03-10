package severus.basicAlgorithm;

public class CountSort {
/*
 * 计数排序：
 * 思路关键：
 * 第一种：针对初始数组，统计数组中每个数的计数（小于或等于该数的个数），然后根据该数的排序计数将该数放入相应的桶中，
 * 最后将数从桶中顺序倒出，即为排序数组。
 * 第二种：默认数组中数的范围为0~n，则新建统计数组，将原始数组中每个数放入相应位置，并计算出现次数，最后，遍历统计数组，将数据输出到输出数组。
 */
	private static int[] array=new int[]{1,2,3,5,2,3};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countSort1(array);
		for(int a:array){
			System.out.println(a);
		}
	}
	/*
	 * 最简单情况：
	 * 1、初始化计数数组，大小为输入数组中最大数
	 * 2、遍历输入数组，统计数组中数出现个数
	 * 3、将计数数组输出到输入数组。
	 */
	private static void countSort1(int[] A){
		if(A==null||A.length<2){
			return;
		}
		int min=A[0];
		int max=A[0];
		for(int i=0;i<A.length;i++){
			if(A[i]>max)
				max=A[i];
			if(A[i]<min)
				min=A[i];
		}
		int [] countArray=new int[max-min+1];
		for(int i=0;i<A.length;i++){
			countArray[A[i]-min]++;
		}
		int index=0;
		for(int i=0;i<countArray.length;i++){
			while(countArray[i]-->0)
				A[index++]=i+min;
		}
	}

}
