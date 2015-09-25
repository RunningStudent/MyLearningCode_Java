/*
打印杨辉三角
*/
import java.util.Scanner;
class Array2Test2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("输入");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		
		//先把第一个数字和这一行的最后一个数字设置为1
		for(int i=0;i<n;i++)
		{
			arr[i][0]=1;
			arr[i][i]=1;
		}
		
		//再计算中间的数字
		for(int i=2;i<n;i++)
		{
			for(int j=1;j<i;j++)
			{
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
			}
		}
		
		//输出
		printArray(arr);
		
		
	}
	
	public static void printArray(int[][] array2){
		//System.out.println(array2[0][0]);
		for(int i=0;i<array2.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(array2[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}