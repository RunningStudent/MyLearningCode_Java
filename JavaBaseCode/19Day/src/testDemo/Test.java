package testDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;





public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Test();
	}
	
	public static void Test(){
		Scanner scanner=new Scanner(System.in);
		int i1=scanner.nextInt();
		
		scanner.next();
		int i2=scanner.nextInt();
		
		System.out.println("i1-----"+i1+"  i2----"+i2);
	}
	
	
	/**
	 * �����ı��ļ�	
	 * @param srcString Դ�ļ�·��
	 * @param tarString �����ļ�·��
	 * @throws IOException 
	 */
	public static void Demo4(String srcString,String tarString) throws IOException{
		FileInputStream fis=new FileInputStream(srcString);
		FileOutputStream fos=new FileOutputStream(tarString);
		int bty=0;
		while((bty=fis.read())!=-1){
			fos.write(bty);
		}
		fis.close();
		fos.close();
		System.out.println("ok");
		
	}
	
	/**
	 * ����һ���ı��ļ�demo
	 * @throws IOException 
	 */
	public static void  FileDemo3(String contextString,String filePath) throws IOException {
		FileOutputStream fos=new FileOutputStream(filePath);
		fos.write(contextString.getBytes());
		/*
		 * A:���������������������Ϳ��Ա�����������������
		 * B:֪ͨϵͳȥ�ͷŸ����ļ���ص���Դ
		 */
		fos.close();
	}
	
	/**
	 * ��ȡE��������ָ�������ļ����ļ���
	 */
	public static void FileDemo1(String postfix) {
		File epath = new File("E:\\");
		File[] files = epath.listFiles();
		
		for (File file : files) {
			if (file.isFile())
				if (file.getName().split("\\.")[1].equals(postfix)) {
					System.out.println(file.getName());
				}
		}
	}
	
	/**
	 * �ݹ���path��������չ��Ϊext���ļ�,����ӡ�ļ���
	 * @param path
	 * @param ext
	 */
	public static void FileDemo2(File path,String ext){
		File[] files=path.listFiles();
		//��Щ�ļ��ܱ���,files���ܱ��null,foreach���ܶ�nullʹ��
		if(files==null){
			return;
		}
		for (File file : files) {
			if(file.isFile()&&file.getName().endsWith(ext)){
				System.out.println(file.getName());
			}else {
				FileDemo2(file, ext);
			}
		}
	}
	
}
