class Father{
	public Father(){
		System.out.println("���Ǹ�����޲ι��캯��");
	}
	public Father(String str){
		System.out.println("���Ǹ���������Ĺ��캯��\n"+str);
	}
}
class Son extends Father{
	public Son(){
		System.out.println("���������޲εĹ��캯��");
	}
	public Son(String str){
		//��super��this���ø������Ĺ��캯��
		super("��Ҫ�������޲ι��캯���е��ø����в������캯��");
		//super�����ڹ��캯���ĵ�һ��,this��superֻ��д1��
		System.out.println("��������������Ĺ��캯��");
	}
}
class InheritTestDemo{
	public static void main(String[] args){
		Son s=new Son("");
	}
}