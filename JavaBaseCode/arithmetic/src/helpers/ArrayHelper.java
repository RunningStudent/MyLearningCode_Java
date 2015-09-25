package helpers;

public class ArrayHelper {
	
	
	/**
	 * 克隆数组
	 * @param array
	 * @return
	 */
	public static double[] cloneArray(double[] array){
		double[] newArray=new double[array.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]=array[i];
		}
		return newArray;
	}


	
	/**
	 * 获得平均值
	 * @param array
	 * @return
	 */
	public static double getAverage(double[] array){
		
		double sum=0;
		for (double i : array) {
			sum+=i;
		}
		return (double)sum/array.length;
	}
	
	
	/**
	 * 获得数组最大值
	 * @param array
	 * @return
	 */
	public static int getMaxValue(int[] array){
		int max=array[0];
		for (int i : array) {
			if (max<i) {
				max=i;
			}
		}
		return max;
	}
	
	/**
	 * 获得数组最大值
	 * @param array
	 * @return
	 */
	public static double getMaxValue(double[] array){
		double max=array[0];
		for (double i : array) {
			if (max<i) {
				max=i;
			}
		}
		return max;
	}
	
	
}
