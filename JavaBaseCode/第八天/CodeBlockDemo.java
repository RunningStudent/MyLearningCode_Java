class CodeBlockDemo
{
	{
		System.out.println("���ǹ�������");
		System.out.println("���ڹ��캯������ǰ����,����ÿ����ʵ����������");
		System.out.println("�ҳ����Ƕ�����캯����ͬ�Ĳ���");
	}
	
	static{
		System.out.println("���Ǿ�̬�����");
		System.out.println("��������������õ�,����ֻ�ڵ�һ��ʵ��������ʱ�����");
		System.out.println("��ͨ���������ʼ��");
	}
	CodeBlockDemo(){
		System.out.println("���ǹ��캯��");
	}
}
//	��̬�����,��������,���췽����ִ��˳��?
//	��̬����� -- �������� -- ���췽��
//	��̬����飺ִֻ��һ��
//	�������飺ÿ�ε��ù��췽����ִ��
class CodeBlockTestDemo{
	
	public static void main(String[] args){
		System.out.println("��һ�����󴴽�");
		CodeBlockDemo c1=new CodeBlockDemo();
		System.out.println("�ڶ������󴴽�");
		CodeBlockDemo c2=new CodeBlockDemo();
	}
	/*���
	��һ�����󴴽�
	���Ǿ�̬�����
	��������������õ�,����ֻ�ڵ�һ��ʵ��������ʱ�����
	��ͨ���������ʼ��
	���ǹ�������
	���ڹ��캯������ǰ����,����ÿ����ʵ����������
	�ҳ����Ƕ�����캯����ͬ�Ĳ���
	���ǹ��캯��
	�ڶ������󴴽�
	���ǹ�������
	���ڹ��캯������ǰ����,����ÿ����ʵ����������
	�ҳ����Ƕ�����캯����ͬ�Ĳ���
	���ǹ��캯��
	*/
}