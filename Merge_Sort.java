
public class Merge_Sort {
	int[] array;
	int[] temp_Merge_Array;
	int length;
	public static void main(String[] args)
	{
		int[] inputArr= {48,36,13,19,94,21,76};
		Merge_Sort ms=new Merge_Sort();
		ms.sort(inputArr);
		
		for(int i:inputArr)
		{
			System.out.print(i+"");
		}
	}
	private void sort(int[] inputArr) {
		// TODO Auto-generated method stub
		this.array=inputArr;
		this.length=inputArr.length;
		this.temp_Merge_Array=new int[length];
		divideArray(0,length-1);
	}
	private void divideArray(int LowerIndex, int HigherIndex) {
		// TODO Auto-generated method stub
		if(LowerIndex<HigherIndex)
		{
			int middle=LowerIndex+(HigherIndex-LowerIndex)/2;
			
			//it will sort the left side of an array
			divideArray(LowerIndex, middle);
			
			//it will sort the right side of an array
			divideArray(middle+1, HigherIndex);
			
			mergArray(LowerIndex,middle,HigherIndex);
		}
	}
	private void mergArray(int LowerIndex, int middle, int HigherIndex) {
		// TODO Auto-generated method stub
		for(int i=LowerIndex;i<=HigherIndex;i++)
		{
			temp_Merge_Array[i]=array[i];
		}
		int i=LowerIndex;
		int j=middle+1;
		int k=LowerIndex;
		while(i<middle &&j<=HigherIndex)
		{
			if(temp_Merge_Array[i]<= temp_Merge_Array[i])
			{
				array[k]=temp_Merge_Array[i];
				i++;
			}
			else
			{
				array[k]=temp_Merge_Array[i];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=temp_Merge_Array[i];
			k++;
			i++;
		}
	}
}
