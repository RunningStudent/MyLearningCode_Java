/*
	一个标准代码的最终版。
	学生类：
		成员变量：
			name，age
		构造方法：
			无参，带两个参
		成员方法：
			getXxx()/setXxx()
			show()：输出该类的所有成员变量值
			
	给成员变量赋值：
		A:setXxx()方法
		B:构造方法
		
	输出成员变量值的方式：
		A:通过getXxx()分别获取然后拼接
		B:通过调用show()方法搞定
*/
class Student
{
	private String name;
	private int age;
	Student()
	{
		System.out.println("我是无参数的构造函数");
	}	
	Student(String str)
	{
		System.out.println("我是有一个String类型参数:"+str+"的构造函数");
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void show(){
		System.out.println("年龄为:"+this.age+"名字为:"+this.name);
	}
}
class StudentDemo
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setAge(18);
		s.setName("傻逼一号");
		s.show();
		
		Student s2=new Student("我是第二个学生");
	}
}
