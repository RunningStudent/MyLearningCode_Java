/*
	һ����׼��������հ档
	ѧ���ࣺ
		��Ա������
			name��age
		���췽����
			�޲Σ���������
		��Ա������
			getXxx()/setXxx()
			show()�������������г�Ա����ֵ
			
	����Ա������ֵ��
		A:setXxx()����
		B:���췽��
		
	�����Ա����ֵ�ķ�ʽ��
		A:ͨ��getXxx()�ֱ��ȡȻ��ƴ��
		B:ͨ������show()�����㶨
*/
class Student
{
	private String name;
	private int age;
	Student()
	{
		System.out.println("�����޲����Ĺ��캯��");
	}	
	Student(String str)
	{
		System.out.println("������һ��String���Ͳ���:"+str+"�Ĺ��캯��");
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
		System.out.println("����Ϊ:"+this.age+"����Ϊ:"+this.name);
	}
}
class StudentDemo
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setAge(18);
		s.setName("ɵ��һ��");
		s.show();
		
		Student s2=new Student("���ǵڶ���ѧ��");
	}
}
