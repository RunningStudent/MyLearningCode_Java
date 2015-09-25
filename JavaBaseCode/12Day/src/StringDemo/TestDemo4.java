package StringDemo;
/**
 * ×Ö·û´®·´×ª
 * @author Recod_000
 *
 */
public class TestDemo4 {

	public static String ReverseString(String src){
		char[] charArray=src.toCharArray();
		String result="";
		for(int i=charArray.length-1;i>=0;i--){
			result+=charArray[i];
		}
		return result;
	}
}
