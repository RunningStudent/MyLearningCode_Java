import java.util.Scanner;

class FunctionTest2{
	/*
		输出
		*****
		*****
		*****
		*****
	*/
	public static void printXing(int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("输入行,列");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(n+"  "+m);
		printXing(n,m);
	}
	
	
	
}
