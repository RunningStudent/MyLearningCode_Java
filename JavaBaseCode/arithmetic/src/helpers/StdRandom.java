package helpers;

import java.util.Random;


/**
 * ����෽��
 * @author Recod_000
 *
 */
public final class StdRandom {

	private static Random random;
	
	/**
	 *��ʼ��������� 
	 * @param seed
	 */
	public static void  initialize(long seed) {
		random=new Random(seed);
	}
	
	static{
		random=new Random(System.currentTimeMillis());
	}
	
	
	/**
	 * ����0��1
	 * @return
	 */
	public static double random(){
		return random.nextDouble();
	}
	
	/**
	 * ����0��N
	 * @param N
	 * @return
	 */
	public static int uniform(int N) {
		return (int)StdRandom.random()*N;
	}
	
	/**
	 * ����low��height������
	 * @param low
	 * @param height
	 * @return
	 */
	public static int uniform(int low,int height){
		return low+uniform(low-height);
	}
	
	public static double uniform(double N) {
		return StdRandom.random()*N;
	}
	
	public static double uniform(double low,double height) {
		return low+uniform(low-height);
	}
	
	/**
     * ����һ�����booleanֵ,��p��ʾ�˲���ֵΪ��ĸ���
     * @param p 0~1 ֮���doubleֵ,��ʾ����boolean��ֵ�Ŀ�����
     */
    public static boolean bernoulli(double p) {
        return random() < p;
    }
 
	
	
}
