import java.util.Scanner;

class FunctionTest3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ����");
		int n=sc.nextInt();
		printMultipleTable(n);
	}
	
	/*
		���n*n�˷���
	*/
	public static void printMultipleTable(int n)
	{
		//Ҫȡ�õ�
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