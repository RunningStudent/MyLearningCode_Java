class CodeBlockDemo
{
	{
		System.out.println("我是构造代码块");
		System.out.println("我在构造函数调用前调用,而且每次类实例化都调用");
		System.out.println("我常常是多个构造函数相同的部分");
	}
	
	static{
		System.out.println("我是静态代码块");
		System.out.println("我是类中最早调用的,但是只在第一次实例化对象时候调用");
		System.out.println("我通常用于类初始化");
	}
	CodeBlockDemo(){
		System.out.println("我是构造函数");
	}
}
//	静态代码块,构造代码块,构造方法的执行顺序?
//	静态代码块 -- 构造代码块 -- 构造方法
//	静态代码块：只执行一次
//	构造代码块：每次调用构造方法都执行
class CodeBlockTestDemo{
	
	public static void main(String[] args){
		System.out.println("第一个对象创建");
		CodeBlockDemo c1=new CodeBlockDemo();
		System.out.println("第二个对象创建");
		CodeBlockDemo c2=new CodeBlockDemo();
	}
	/*输出
	第一个对象创建
	我是静态代码块
	我是类中最早调用的,但是只在第一次实例化对象时候调用
	我通常用于类初始化
	我是构造代码块
	我在构造函数调用前调用,而且每次类实例化都调用
	我常常是多个构造函数相同的部分
	我是构造函数
	第二个对象创建
	我是构造代码块
	我在构造函数调用前调用,而且每次类实例化都调用
	我常常是多个构造函数相同的部分
	我是构造函数
	*/
}