package DateDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class MyLiveTime {
	public static void showMyLiveTime(String myBirthday) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		Date myBirth=sdf.parse(myBirthday);
		
		long myTime=myBirth.getTime();
		long currentTime=System.currentTimeMillis();
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//���������Ӧ��������TimeSpan����
		System.out.println("�������������"+(currentTime-myTime)/1000/60/60/24);
	}
}
