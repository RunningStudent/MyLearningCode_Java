package StringDemo;

/**
 * woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun”中java出现了5次
 * @author Recod_000
 *
 */
public class TestDemo5 {
	
	/**
	 * 计算src字符串中tar出现的次数
	 * @param src
	 * @param tar
	 * @return 次数
	 */
	public static int CountJava(String src,String tar){
		int count=0;
		//indexOf返回-1代表找不到
		while(src.indexOf(tar)!=-1){
			count++;
			src=src.substring(src.indexOf(tar)+tar.length());
		}
		return count;
	}
}
