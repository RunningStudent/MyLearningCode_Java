package StringDemo;

/**
 * woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun����java������5��
 * @author Recod_000
 *
 */
public class TestDemo5 {
	
	/**
	 * ����src�ַ�����tar���ֵĴ���
	 * @param src
	 * @param tar
	 * @return ����
	 */
	public static int CountJava(String src,String tar){
		int count=0;
		//indexOf����-1�����Ҳ���
		while(src.indexOf(tar)!=-1){
			count++;
			src=src.substring(src.indexOf(tar)+tar.length());
		}
		return count;
	}
}
