package StringBuffer;
/**
 * ÅĞ¶Ï×Ö·û´®ÊÇ·ñ¶Ô³Æ
 * @author Recod_000
 *
 */
public class StringBufferDemo1 {
	
	public static boolean isSymmetry(String scr){
		//Ê¹ÓÃStringBufferµÄReverse
		StringBuffer sbBuffer=new StringBuffer(scr);
		if (scr.compareTo(sbBuffer.reverse().toString())!=0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public static boolean isSymmetry2(String src) {
		char[] charArray=src.toCharArray();
		for(int start=0,end=src.length()-1;end>start;end--,start++){
			if(charArray[start]!=charArray[end]){
				return false;
			}
		}
		return true;
	}
}
