/*
����¼���������ݣ������������еĽϴ�ֵ
����¼���������ݣ��Ƚ��������Ƿ����
����¼���������ݣ������������е����ֵ
*/
import java.util.Scanner;

class FunctionTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		/*����¼���������ݣ������������еĽϴ�ֵ
		System.out.println("�����һ����");
		int a=sc.nextInt();
		
		System.out.println("���������");
		int b=sc.nextInt();
		
		System.out.println("�ϴ����"+getMax(a,b));
		*/
		/*����¼���������ݣ��Ƚ��������Ƿ����
		System.out.println("�����һ����");
		int a=sc.nextInt();
		
		System.out.println("���������");
		int b=sc.nextInt();
		
		System.out.println(compare(a,b));
		*/
		/*����¼���������ݣ������������е����ֵ
		System.out.println("�����һ����");
		int a=sc.nextInt();
		
		System.out.println("���������");
		int b=sc.nextInt();
		
		System.out.println("����������");
		int c=sc.nextInt();
			
		System.out.println("����������ǵ�"+maxValueFromThree(a,b,c));
		*/
	
	}
	
	//����¼���������ݣ������������е����ֵ
	public static int maxValueFromThree(int a,int b,int c){
		int temp=a>b?a:b;
		return temp>c?temp:c;
	}
	
	//����¼���������ݣ��Ƚ��������Ƿ����
	public static boolean compare(int a,int b){
		if(a==b){
			return true;
		}else{
			return false;
		}
	}
	//����¼���������ݣ������������еĽϴ�ֵ
	public static int getMax(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	
	
}