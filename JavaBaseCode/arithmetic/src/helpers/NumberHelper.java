package helpers;

public class NumberHelper {
	
	/**
	 * 判断素数
	 * @param number
	 * @return
	 */
	public boolean isPrime(int number) {
		if (number<2) {
			return false;
		}
		for (int i = 2; i*i <number ; i++) {
			if (number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 计算三角形第三边
	 * @param a
	 * @param b
	 * @return
	 */
	public static double  hypotenuse(double a,double b) {
		return Math.sqrt(a*a+b*b);
	}
	
	/**
	 * 获得n的调和级数
	 * @param n
	 * @return
	 */
	public static double H(int n){
		double sum=0.0;
		
		for (int i = 0; i <=n; i++) {
			sum+=1.0/i;
		}
		return sum;
	}
	
	

}
