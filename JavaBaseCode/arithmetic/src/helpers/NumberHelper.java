package helpers;

public class NumberHelper {
	
	/**
	 * �ж�����
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
	 * ���������ε�����
	 * @param a
	 * @param b
	 * @return
	 */
	public static double  hypotenuse(double a,double b) {
		return Math.sqrt(a*a+b*b);
	}
	
	/**
	 * ���n�ĵ��ͼ���
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
