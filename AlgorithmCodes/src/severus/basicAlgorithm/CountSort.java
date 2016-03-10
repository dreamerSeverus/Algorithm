package severus.basicAlgorithm;

public class CountSort {
/*
 * ��������
 * ˼·�ؼ���
 * ��һ�֣���Գ�ʼ���飬ͳ��������ÿ�����ļ�����С�ڻ���ڸ����ĸ�������Ȼ����ݸ������������������������Ӧ��Ͱ�У�
 * �������Ͱ��˳�򵹳�����Ϊ�������顣
 * �ڶ��֣�Ĭ�����������ķ�ΧΪ0~n�����½�ͳ�����飬��ԭʼ������ÿ����������Ӧλ�ã���������ִ�������󣬱���ͳ�����飬�����������������顣
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
	 * ��������
	 * 1����ʼ���������飬��СΪ���������������
	 * 2�������������飬ͳ�������������ָ���
	 * 3������������������������顣
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
