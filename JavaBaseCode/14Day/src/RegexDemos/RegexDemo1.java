package RegexDemos;

import java.util.Arrays;

/**
 * ��������һ���ַ���:��91 27 46 38 50�� ��д����ʵ�������������ǣ���27 38 46 50 91��
 * 
 * @author Recod_000
 *
 */
public class RegexDemo1 {
	public static void Demo() {
		String srcString = "91 27 46 38 50";
		String[] strs = srcString.split(" ");
		Arrays.sort(strs);
		StringBuilder sbBuilder = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {
			sbBuilder.append(strs[i]);
			if (i != strs.length - 1) {
				sbBuilder.append(" ");
			}
		}
		System.out.println(sbBuilder.toString());
		
	}
}
