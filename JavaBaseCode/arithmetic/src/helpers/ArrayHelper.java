package helpers;

public class ArrayHelper {
	
	
	/**
	 * ��¡����
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
	 * ���ƽ��ֵ
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
	 * ����������ֵ
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
	 * ����������ֵ
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
