package StringDemo;


/**
 * ����һ���ַ���,������ĸ��д,����Сд
 * @author Recod_000
 *
 */
public class TestDemo2 {
	
	
	/**
	 * �����ַ���
	 * @param str ��������ַ���
	 * @return
	 */
	public static String processStr(String str) {
		String headString=str.substring(0,1);
		String tailsString=str.substring(1);
		
		String processedHead=headString.toUpperCase();
		String processedTail=tailsString.toLowerCase();
		
		return processedHead+processedTail;
	}
	
//	public static void main(String[] argsStrings){
//
//		
//		
//	}
}
