//ѧ����
class Student
{
	String name;
	int age;
	String address;
	
	public void Study()
	{
		System.out.println("ѧ����ѧϰ");
	}
	
	public void eat()
	{
		System.out.println("ѧϰ����,�Է�ȥ);
	}
	
	public void sleep()
	{
		System.out.println("ѧϰ����,˯��");
	}
}

//ѧ���������
class StudentDemo
{
	public static void main(String[] args)
	{
		//����ѧ������
		Student s=new Student();
		
		//��ʼ��ѧ������
		a.name="���Ǹ�������ѧ��";
		a.age=18;
		a.address="����̹";
		
		//�����ֵ���ѧ����������
		System.out.println(s.name+"-----"+s.age+"-----"+s.address);
		
		//����ѧ�����󷽷�
		a.study();
		a.eat();
		s.sleep();
		
	}
	
}