package StringDemo;
/**
 * int length():获取字符串的长度。
 *char charAt(int index):获取指定索引位置的字符
 *int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
 *		为什么这里是int类型，而不是char类型?
 *		原因是：'a'和97其实都可以代表'a'
 *int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
 *int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
 *int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
 *String substring(int start):从指定位置开始截取字符串,默认到末尾。
 *String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
 * @author Recod_000
 *
 */
public class TestDemo {
//	public static void main(String[] argStrings){
//		String testString="Hello World";
//		
//		System.out.println("==========indexOf测试1=======");
//		int indexofH=testString.indexOf('H');
//		System.out.println(indexofH);
//		
//		System.out.println("===========indexOf测试2=======");
//		int indexofo=testString.indexOf('o',5);
//		System.out.println(indexofo);
//		
//		System.out.println("===========substring测试1=======");
//		
//		String subString=testString.substring(2);
//		System.out.println(subString);
//		
//		System.out.println("===========substring测试3==========");
//		String subString2=testString.substring(2,3);
//		System.out.println(subString2);
//	}
}
