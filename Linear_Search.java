
public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,4,2,1,6};
		int item=3;
		int temp=1;
		for(int i=0;i<arr.length;i++)
				 {
				if(arr[i]==item)
				{
					System.out.println("item is present at "+i+" index position");
				}
		}
		if (temp==0)
		{
			System.out.println("item not found is list");
		}
	}

}
