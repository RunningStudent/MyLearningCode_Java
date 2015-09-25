/*
1.����һ����������,���� ���ܳ�������ķ�����Ȼ����һ��������Test2�����в��ԡ�
2/����һ��Ա����,�Լ�������������Ա��Ȼ�������Ա���������췽����getXxx()/setXxx()�������Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�
3/����һ����MyMath,�ṩ�����ļӼ��˳����ܣ�Ȼ����в��ԡ�
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
	//���,����,����
	private int id;
	private String name;
	private int age;
	
	//get����
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//set����
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
		System.out.println("���:"+this.id+"����:"+this.name+"����:"+this.age);
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
		System.out.println("�ܳ���:"+rec.getCircumference());
		System.out.println("===================");
		System.out.println("�����:"+rec.getArea());
	}
	
	public static void method2()
	{
		Employee em=new Employee();
		em.setName("���ϼ�");
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