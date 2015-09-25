//学生类
class Student
{
	String name;
	int age;
	String address;
	
	public void Study()
	{
		System.out.println("学生爱学习");
	}
	
	public void eat()
	{
		System.out.println("学习饿了,吃饭去);
	}
	
	public void sleep()
	{
		System.out.println("学习累了,睡觉");
	}
}

//学生类测试类
class StudentDemo
{
	public static void main(String[] args)
	{
		//创建学生对象
		Student s=new Student();
		
		//初始化学生数据
		a.name="这是个聪明的学生";
		a.age=18;
		a.address="赛博坦";
		
		//输出赋值后的学生对象数据
		System.out.println(s.name+"-----"+s.age+"-----"+s.address);
		
		//调用学生对象方法
		a.study();
		a.eat();
		s.sleep();
		
	}
	
}