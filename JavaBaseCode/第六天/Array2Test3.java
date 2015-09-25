/*
2:数据加密问题
	某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。 

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
	
	//加密,数字小于8位
	public static String encryptInt(int n)
	{
		int numberLengthCount=0;//数字长度
		int[] nums=new int[8];
		//数字转数组,同时倒序
		while(n>0)
		{
			nums[numberLengthCount]=n%10;
			n/=10;
			numberLengthCount++;
		}
		int temp=0;
		//每位数字都加上5
		//再用和除以10的余数代替该数字
		for(int i=0;i<numberLengthCount;i++)
		{
			nums[i]+=5;
			nums[i]%=10;
		}
		//最后将第一位和最后一位数字交换
		temp=nums[0];
		nums[0]=nums[numberLengthCount-1];
		nums[numberLengthCount-1]=temp;
		
		//转成字符串
		String str="";
		for(int i=0;i<numberLengthCount;i++)
		{
			str+=nums[i];
		}
		return str;
	}
	
	
	
}