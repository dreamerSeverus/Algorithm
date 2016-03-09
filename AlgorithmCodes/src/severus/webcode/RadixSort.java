package severus.webcode;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]data =
	        {73, 22, 93, 43, 55, 14, 28, 65, 39, 81, 33, 100};
	        radixSort(data, 3);
	        for(int i = 0; i < data.length; i++)
	        {
	            System.out.print(data[i] + " ");
	        }		
	}
	/*
	 * @parameter: d,�������λ
	 */
	private static void radixSort(int[] number,int d){
		int k=0;
		int n=1;
		int m=1;//��������һλ����
		int[][] temp=new int[10][number.length];//�����һά��ʾ��������
		int[] order=new int[10];//����order[i]��ʾ��λ��i�����ĸ���
		while(m<=d){
			for(int i=0;i<number.length;i++){
				int lsd=(number[i]/n)%10;
				temp[lsd][order[lsd]]=number[i];
				order[lsd]++;
			}
			for(int i=0;i<10;i++){
				if(order[i]!=0){
					for(int j=0;j<order[i];j++){
						number[k++]=temp[i][j];
					}
					
				}
				order[i]=0;
			}
			n*=10;
			k=0;
			m++;
		}
	}
	
}
