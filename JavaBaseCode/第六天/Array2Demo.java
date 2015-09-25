/*
	编写一个方法遍历二维数组
*/
class ArrayDemo
{
	public static void  main(String[] args)
	{
		int[][] arr={{1,2,3,4},{222,444,555},{999,888,666}};
		printArray(arr);
	}
	
	public static void printArray(int[][] array2){
		for(int i=0;i<array2.length;i++){
			for(int j=0;j<array2[i].length;j++){
				System.out.print(array2[i][j]+"   ");
			}
			System.out.println();
		}
	}
	
}