/*
1.定义一个长方形类,定义 求周长和面积的方法，然后定义一个测试了Test2，进行测试。
2/定义一个员工类,自己分析出几个成员，然后给出成员变量，构造方法，getXxx()/setXxx()方法，以及一个显示所有成员信息的方法。并测试。
3/定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。
*/
class Rectangle{
	private double width;
	private double length;
	public void setWidth(double w){
		this.width=w;
	}
	public double getWidth(){
		return this.width;
	}
	public void setLength(double l){
		this.length=l;
	}
	public double getLength(){
		return this.length;
	}
	public double getCircumference(){
		return 2*(length+width);
	}
	public double getArea(){
		return width*length;
	}
}

class Employee
{
	//编号,姓名,年龄
	private int id;
	private String name;
	private int age;
	
	//get方法
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//set方法
	public void setID(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	public void showAll(){
		System.out.println("编号:"+this.id+"姓名:"+this.name+"年龄:"+this.age);
	}
	
}

class MyMath
{
	private double number1;
	private double number2;
	public void setNum1(double n){
		this.number1=n;
	}
	public void setNum2(double n){
		this.number2=n;
	}
	public double getNum1(){
		return this.number1;
	}
	public double getNum2(){
		return this.number2;
	}
	
	public double add(){
		return number1+number2;
	}
	public double sub(){
		return number1-number2;
	}
	public double multiply(){
		return number1*number2*1.0;
	}
	public double devision(){
		return number1/number2*1.0;
	}
}
class Demo
{
	public static void main(String[] args)
	{
		
		method3();
	}
	public static void method1()
	{
		Rectangle rec=new Rectangle();
		rec.setLength(100);
		rec.setWidth(200);
		System.out.println("周长是:"+rec.getCircumference());
		System.out.println("===================");
		System.out.println("面积是:"+rec.getArea());
	}
	
	public static void method2()
	{
		Employee em=new Employee();
		em.setName("王老吉");
		em.setAge(130);
		em.setID(76145);
		em.showAll();
	}
	
	public static void method3()
	{
		MyMath m=new MyMath();
		m.setNum1(123);
		m.setNum2(457);
		
		System.out.println(m.getNum1()+"+"+m.getNum2()+"="+m.add());
		System.out.println(m.getNum1()+"-"+m.getNum2()+"="+m.sub());
		System.out.println(m.getNum1()+"*"+m.getNum2()+"="+m.multiply());
		System.out.println(m.getNum1()+"/"+m.getNum2()+"="+m.devision());
		
	}
	
}