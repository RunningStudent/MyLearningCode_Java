/*
	Math��lang�в���Ҫ����
	random(),����[0,1)��doubleα���
	
*/
class MathDemo{
	public static void main(String[] args){
		//��ȡ100��1-100֮�������
		for(int i=0;i<100;i++){
			System.out.println((int)(Math.random()*100)+1);
		}
	}
}