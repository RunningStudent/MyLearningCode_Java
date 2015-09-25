/**
*这是Array类的工具包,有一些简单的对Array操作的方法
*@version 1.0
*@author 狂拽酷炫叼昨天
*/
public class ArrayTool
{
	/**
	*这是遍历输出数组元素的方法
	*@param arr 被遍历的数组
	*/
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	/**
	*这是获得数组中最大值元素
	*@param arr 被遍历的数组
	*@return 返回的数组中的最大值
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
	*返回指定元素在数组中的索引,如果找不到,那么返回-1
	*@param arr 被遍历的数组
	*@param value 要找的数据
	*@return 数据在数组中的索引
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
