/*
	Math在lang中不需要导入
	random(),返回[0,1)的double伪随机
	
*/
class MathDemo{
	public static void main(String[] args){
		//获取100个1-100之间随机数
		for(int i=0;i<100;i++){
			System.out.println((int)(Math.random()*100)+1);
		}
	}
}