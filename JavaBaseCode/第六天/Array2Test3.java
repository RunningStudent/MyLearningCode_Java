/*
2:���ݼ�������
	ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
	�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������ 

*/

import java.util.Scanner;
class Array2Test3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(encryptInt(n));
		
	}
	
	//����,����С��8λ
	public static String encryptInt(int n)
	{
		int numberLengthCount=0;//���ֳ���
		int[] nums=new int[8];
		//����ת����,ͬʱ����
		while(n>0)
		{
			nums[numberLengthCount]=n%10;
			n/=10;
			numberLengthCount++;
		}
		int temp=0;
		//ÿλ���ֶ�����5
		//���úͳ���10���������������
		for(int i=0;i<numberLengthCount;i++)
		{
			nums[i]+=5;
			nums[i]%=10;
		}
		//��󽫵�һλ�����һλ���ֽ���
		temp=nums[0];
		nums[0]=nums[numberLengthCount-1];
		nums[numberLengthCount-1]=temp;
		
		//ת���ַ���
		String str="";
		for(int i=0;i<numberLengthCount;i++)
		{
			str+=nums[i];
		}
		return str;
	}
	
	
	
}