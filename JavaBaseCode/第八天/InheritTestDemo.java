class Father{
	public Father(){
		System.out.println("我是父类的无参构造函数");
	}
	public Father(String str){
		System.out.println("我是父类代参数的构造函数\n"+str);
	}
}
class Son extends Father{
	public Son(){
		System.out.println("我是子类无参的构造函数");
	}
	public Son(String str){
		//用super或this调用父类或本类的构造函数
		super("我要在子类无参构造函数中调用父类有参数构造函数");
		//super必须在构造函数的第一句,this或super只能写1个
		System.out.println("我是子类带参数的构造函数");
	}
}
class InheritTestDemo{
	public static void main(String[] args){
		Son s=new Son("");
	}
}