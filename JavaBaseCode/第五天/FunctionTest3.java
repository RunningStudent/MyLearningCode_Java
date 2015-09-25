import java.util.Scanner;

class FunctionTest3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数");
		int n=sc.nextInt();
		printMultipleTable(n);
	}
	
	/*
		输出n*n乘法表
	*/
	public static void printMultipleTable(int n)
	{
		//要取得等
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		
	}
		
}