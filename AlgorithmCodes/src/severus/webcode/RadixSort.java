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
	 * @parameter: d,最大数数位
	 */
	private static void radixSort(int[] number,int d){
		int k=0;
		int n=1;
		int m=1;//控制在哪一位排序
		int[][] temp=new int[10][number.length];//数组第一维表示可能余数
		int[] order=new int[10];//数组order[i]表示该位是i的数的个数
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
