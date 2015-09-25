package StringDemo;



/**
 * 把数组int {1,2,3} 编程字符串[1,2,3]
 * @author Recod_000
 *
 */
public class TestDemo3 {
	public static String ProcessArray(int[] array){
		String result="";
		result+="[";
		for(int i=0;i<array.length;i++){
			result+=array[i]+",";
		}
		result=result.substring(0,result.lastIndexOf(','));
		result+="]";
		return result;
	}
	
	
	public static void StringTestDemo3Star(){
		int[] array={1,2,3};
		System.out.println(ProcessArray(array));
	}
	
	
}
