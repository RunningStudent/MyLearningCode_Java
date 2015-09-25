/**
*����Array��Ĺ��߰�,��һЩ�򵥵Ķ�Array�����ķ���
*@version 1.0
*@author ��ק���ŵ�����
*/
public class ArrayTool
{
	/**
	*���Ǳ����������Ԫ�صķ���
	*@param arr ������������
	*/
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	/**
	*���ǻ�����������ֵԪ��
	*@param arr ������������
	*@return ���ص������е����ֵ
	*/
	public static int getMaxValue(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
	
	/**
	*����ָ��Ԫ���������е�����,����Ҳ���,��ô����-1
	*@param arr ������������
	*@param value Ҫ�ҵ�����
	*@return �����������е�����
	*/
	public static int getValueIndex(int[] arr,int value){
		int index=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				index=i;
				break;
			}
		}
		return index;
	}
	
}
