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
	 * 用set保存10个随机数(1-20)
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
		// 创建集合对象
		HashSet<Student> hs = new HashSet<Student>();

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("柳岩", 22);
		Student s3 = new Student("王祖贤", 30);
		Student s4 = new Student("林青霞", 27);
		Student s5 = new Student("林青霞", 20);
		Student s6 = new Student("范冰冰", 22);

		// 添加元素
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);

		// 遍历集合
		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}

	}
	
	
	public static void Demo1(){
		// 创建集合对象
		Set<String> set = new HashSet<String>();

		// 创建并添加元素
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");

		// 增强for
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
