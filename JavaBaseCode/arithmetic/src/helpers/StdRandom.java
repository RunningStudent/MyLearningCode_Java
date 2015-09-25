package helpers;

import java.util.Random;


/**
 * 随机类方法
 * @author Recod_000
 *
 */
public final class StdRandom {

	private static Random random;
	
	/**
	 *初始化随机对象 
	 * @param seed
	 */
	public static void  initialize(long seed) {
		random=new Random(seed);
	}
	
	static{
		random=new Random(System.currentTimeMillis());
	}
	
	
	/**
	 * 返回0到1
	 * @return
	 */
	public static double random(){
		return random.nextDouble();
	}
	
	/**
	 * 返回0到N
	 * @param N
	 * @return
	 */
	public static int uniform(int N) {
		return (int)StdRandom.random()*N;
	}
	
	/**
	 * 返回low到height的数字
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
     * 返回一个随机boolean值,该p表示此布尔值为真的概率
     * @param p 0~1 之间的double值,表示产生boolean真值的可能性
     */
    public static boolean bernoulli(double p) {
        return random() < p;
    }
 
	
	
}
