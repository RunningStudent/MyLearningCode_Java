/*
键盘录入两个数据，返回两个数中的较大值
键盘录入两个数据，比较两个数是否相等
键盘录入三个数据，返回三个数中的最大值
*/
import java.util.Scanner;

class FunctionTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		/*键盘录入两个数据，返回两个数中的较大值
		System.out.println("输入第一个数");
		int a=sc.nextInt();
		
		System.out.println("输入二个数");
		int b=sc.nextInt();
		
		System.out.println("较大的是"+getMax(a,b));
		*/
		/*键盘录入两个数据，比较两个数是否相等
		System.out.println("输入第一个数");
		int a=sc.nextInt();
		
		System.out.println("输入二个数");
		int b=sc.nextInt();
		
		System.out.println(compare(a,b));
		*/
		/*键盘录入三个数据，返回三个数中的最大值
		System.out.println("输入第一个数");
		int a=sc.nextInt();
		
		System.out.println("输入二个数");
		int b=sc.nextInt();
		
		System.out.println("输入三个数");
		int c=sc.nextInt();
			
		System.out.println("三个数最大是的"+maxValueFromThree(a,b,c));
		*/
	
	}
	
	//键盘录入三个数据，返回三个数中的最大值
	public static int maxValueFromThree(int a,int b,int c){
		int temp=a>b?a:b;
		return temp>c?temp:c;
	}
	
	//键盘录入两个数据，比较两个数是否相等
	public static boolean compare(int a,int b){
		if(a==b){
			return true;
		}else{
			return false;
		}
	}
	//键盘录入两个数据，返回两个数中的较大值
	public static int getMax(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	
	
}