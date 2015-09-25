package StringDemo;


/**
 * 输入一个字符串,把首字母大写,其余小写
 * @author Recod_000
 *
 */
public class TestDemo2 {
	
	
	/**
	 * 处理字符串
	 * @param str 被处理的字符串
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
