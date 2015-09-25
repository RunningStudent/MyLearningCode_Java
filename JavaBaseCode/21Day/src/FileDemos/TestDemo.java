package FileDemos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.File;

public class TestDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String srcString = "D:\\1.txt";
		String tarString = "E:\\2.txt";
		// method1(srcString,tarString);//�����ַ���_һ���ַ�
		// method2(srcString,tarString);//�����ַ���_һ���ַ�
		// method3(srcString,tarString);//��Ч�ַ���_һ���ַ�
		// method4(srcString,tarString);//��Ч�ַ���_һ���ַ�
		 method5(srcString,tarString);//��Ч�ַ���_һ���ַ�

		// method6();//���Ƶ����ļ���
		
		method7();// ���ƶ༶�ļ���

	}

	// ���ƶ༶�ļ���
	private static void method7() throws IOException {
		String srcPathString = "d:\\t";
		String tarPathString = "d:\\e";

		File srcFolder = new File(srcPathString);
		File tarFolder = new File(tarPathString);
		// �ж��ļ����Ƿ����,�����ڴ���
		if (!tarFolder.exists()) {
			tarFolder.mkdir();
		}

		// ��ȡ�ļ����µ��ļ�
		File[] files = srcFolder.listFiles();
		// �������鱣���ļ�
		for (File file : files) {
			CopyFolder(file, tarFolder);
		}
	}

	// ���Ƶ����ļ���
	private static void method6() throws IOException {
		String srcPathString = "d:\\t";
		String tarPathString = "d:\\e";

		File srcFolder = new File(srcPathString);
		File tarFolder = new File(tarPathString);
		// �ж��ļ����Ƿ����,�����ڴ���
		if (!tarFolder.exists()) {
			tarFolder.mkdir();
		}
		// ��ȡ�ļ����µ��ļ�
		File[] files = srcFolder.listFiles();
		// �������鱣���ļ�
		for (File file : files) {
			File newFile = new File(tarFolder, file.getName());
			CopeFile(file, newFile);
		}
	}

	// �����ļ���
	public static void CopyFolder(File src, File tar) throws IOException {
		if (src.isDirectory()) {
			// ����Ǹ��ļ���,Ҫ��Ŀ���ļ������´������ļ���
			File newFolder = new File(tar, src.getName());
			newFolder.mkdir();

			File[] files = src.listFiles();
			for (File file : files) {
				CopyFolder(file, newFolder);
			}

		} else {
			File newFile = new File(tar, src.getName());
			CopeFile(src, newFile);
		}
	}

	// �����ļ�
	public static void CopeFile(File srcfile, File tarfile) throws IOException {
		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream(srcfile));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream(tarfile));

		byte[] bs = new byte[1024];
		int length = 0;
		while ((length = bufferedInputStream.read(bs)) != -1) {
			bufferedOutputStream.write(bs, 0, length);
		}

		bufferedInputStream.close();
		bufferedOutputStream.close();

	}

	/**
	 *  ��Ч�ַ���_һ���ַ�
	 * @param srcString
	 * @param tarString
	 * @throws IOException
	 */
	private static void method5(String srcString, String tarString)
			throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				srcString));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				tarString));

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
		}

		bufferedReader.close();
		bufferedWriter.close();
	}

	// ��Ч�ַ���_һ���ַ�
	private static void method3(String srcString, String tarString)
			throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				srcString));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				tarString));

		int ch = 0;
		while ((ch = bufferedReader.read()) != -1) {
			bufferedWriter.write(ch);
		}

		bufferedReader.close();
		bufferedWriter.close();
	}

	private static void method4(String srcString, String tarString)
			throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				srcString));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
				tarString));

		int length = 0;
		char[] cs = new char[1024];
		while ((length = bufferedReader.read(cs)) != -1) {
			bufferedWriter.write(cs, 0, length);
		}

		bufferedReader.close();
		bufferedWriter.close();
	}

	// �����ַ���_һ���ַ�
	private static void method2(String srcString, String tarString)
			throws IOException {
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(tarString);
		int length = 0;
		char[] cbuf = new char[1024];
		while ((length = fr.read(cbuf)) != -1) {
			fw.write(cbuf, 0, length);
		}
		fr.close();
		fw.close();
	}

	// �����ַ���_һ���ַ�
	private static void method1(String srcString, String tarString)
			throws IOException {
		FileReader fr = new FileReader(srcString);
		FileWriter fw = new FileWriter(tarString);

		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
