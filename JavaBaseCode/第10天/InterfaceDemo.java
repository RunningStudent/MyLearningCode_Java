abstract class Person{
	public String name;
	public int age;
	public abstract void sleep();
	public abstract void eat();
}
abstract class Athlete extends Person{
	public abstract void learn();
}
abstract class Coach extends Person{
	public abstract void teach();
}
interface SpeakEnglish{
	public abstract void learnEnglish();
}

class PingPongAthlete extends Athlete implements SpeakEnglish{
	public void sleep(){
		System.out.println("ƹ�����˶�Ա��˯��");
	}
	public void learnEnglish(){
		System.out.println("ƹ�����˶�Ա��ѧϰӢ��");
	}
	public void eat(){
		System.out.println("ƹ�����˶�Ա�ڳԷ�");
	}
	public void learn(){
		learnEnglish();
	}
}
class BasketBallAthlete extends Athlete{
	public void sleep(){
		System.out.println("�����˶�Ա��˯��");
	}
	public void eat(){
		System.out.println("�����˶�Ա�ڳԷ�");
	}
	public void learn(){
		System.out.println("�����˶�Ա��ѧϰ");
	}
}
class PingPongCoach extends Coach implements SpeakEnglish{
	public void sleep(){
		System.out.println("ƹ���������˯��");
	}
	public void eat(){
		System.out.println("ƹ��������ڳԷ�");
	}
	
	public void teach(){
		System.out.println("ƹ��������ڽ�ƹ����");
	}
	public void learnEnglish(){
		System.out.println("ƹ���������ѧӢ��");
	}
	
}

class BasketCoach extends Coach {
	public void sleep(){
		System.out.println("���������˯��");
	}
	public void eat(){
		System.out.println("��������ڳԷ�");
	}
	public void teach(){
		System.out.println("��������ڽ�����");
	}
	
}
class TestDemo{
	public static void main(String[] args){
		PingPongAthlete pa=new PingPongAthlete();
		BasketBallAthlete ba =new BasketBallAthlete();
		PingPongCoach pc=new PingPongCoach();
		BasketCoach bc=new BasketCoach();
		System.out.println("=======ƹ�����˶�Ա====");
		pa.eat();
		pa.sleep();
		pa.learn();
		System.out.println("=======�����˶�Ա====");
		ba.eat();
		ba.sleep();
		ba.learn();
		System.out.println("=======ƹ�������====");
		pc.eat();
		pc.sleep();
		pc.teach();
		System.out.println("=======�������====");
		bc.eat();
		bc.sleep();
		bc.teach();
		/*
		���
		=======ƹ�����˶�Ա====
		ƹ�����˶�Ա�ڳԷ�
		ƹ�����˶�Ա��˯��
		ƹ�����˶�Ա��ѧϰӢ��
		=======�����˶�Ա====
		�����˶�Ա�ڳԷ�
		�����˶�Ա��˯��
		�����˶�Ա��ѧϰ
		=======ƹ�������====
		ƹ��������ڳԷ�
		ƹ���������˯��
		ƹ��������ڽ�ƹ����
		=======�������====
		��������ڳԷ�
		���������˯��
		��������ڽ�����
		*/
	}
}

