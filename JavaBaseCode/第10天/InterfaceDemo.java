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
		System.out.println("乒乓球运动员在睡觉");
	}
	public void learnEnglish(){
		System.out.println("乒乓球运动员在学习英语");
	}
	public void eat(){
		System.out.println("乒乓球运动员在吃饭");
	}
	public void learn(){
		learnEnglish();
	}
}
class BasketBallAthlete extends Athlete{
	public void sleep(){
		System.out.println("篮球运动员在睡觉");
	}
	public void eat(){
		System.out.println("篮球运动员在吃饭");
	}
	public void learn(){
		System.out.println("篮球运动员在学习");
	}
}
class PingPongCoach extends Coach implements SpeakEnglish{
	public void sleep(){
		System.out.println("乒乓球教练在睡觉");
	}
	public void eat(){
		System.out.println("乒乓球教练在吃饭");
	}
	
	public void teach(){
		System.out.println("乒乓球教练在教乒乓球");
	}
	public void learnEnglish(){
		System.out.println("乒乓球教练在学英语");
	}
	
}

class BasketCoach extends Coach {
	public void sleep(){
		System.out.println("蓝球教练在睡觉");
	}
	public void eat(){
		System.out.println("蓝球教练在吃饭");
	}
	public void teach(){
		System.out.println("蓝球教练在教篮球");
	}
	
}
class TestDemo{
	public static void main(String[] args){
		PingPongAthlete pa=new PingPongAthlete();
		BasketBallAthlete ba =new BasketBallAthlete();
		PingPongCoach pc=new PingPongCoach();
		BasketCoach bc=new BasketCoach();
		System.out.println("=======乒乓球运动员====");
		pa.eat();
		pa.sleep();
		pa.learn();
		System.out.println("=======篮球运动员====");
		ba.eat();
		ba.sleep();
		ba.learn();
		System.out.println("=======乒乓球教练====");
		pc.eat();
		pc.sleep();
		pc.teach();
		System.out.println("=======蓝球教练====");
		bc.eat();
		bc.sleep();
		bc.teach();
		/*
		输出
		=======乒乓球运动员====
		乒乓球运动员在吃饭
		乒乓球运动员在睡觉
		乒乓球运动员在学习英语
		=======篮球运动员====
		篮球运动员在吃饭
		篮球运动员在睡觉
		篮球运动员在学习
		=======乒乓球教练====
		乒乓球教练在吃饭
		乒乓球教练在睡觉
		乒乓球教练在教乒乓球
		=======蓝球教练====
		蓝球教练在吃饭
		蓝球教练在睡觉
		蓝球教练在教篮球
		*/
	}
}

