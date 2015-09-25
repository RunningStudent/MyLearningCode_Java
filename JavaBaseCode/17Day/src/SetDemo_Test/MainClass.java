package SetDemo_Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3();
	}
	
	
	/**
	 * ��set����10�������(1-20)
	 */
	public static void Demo3(){
		Random random=new Random();
		HashSet<Integer>hashSet=new HashSet<>();
		while(hashSet.size()<10){
			hashSet.add(random.nextInt(20)+1);
		}
		for (Integer integer : hashSet) {
			System.out.println(integer);
		}
	}
	
	
	public static void Demo2() {
		// �������϶���
		HashSet<Student> hs = new HashSet<Student>();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("����", 22);
		Student s3 = new Student("������", 30);
		Student s4 = new Student("����ϼ", 27);
		Student s5 = new Student("����ϼ", 20);
		Student s6 = new Student("������", 22);

		// ���Ԫ��
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);

		// ��������
		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}
	
	
	public static void Demo1(){
		// �������϶���
		Set<String> set = new HashSet<String>();

		// ���������Ԫ��
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");

		// ��ǿfor
		for (String s : set) {
			System.out.println(s);
		}
		/*
		 	hello
			java
			world
		*/

	}
}
