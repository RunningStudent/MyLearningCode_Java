package RegexDemos;

import java.util.Arrays;

/**
 * 我有如下一个字符串:”91 27 46 38 50” 请写代码实现最终输出结果是：”27 38 46 50 91”
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
