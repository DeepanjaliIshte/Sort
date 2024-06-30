
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,7,8,19,20,3,1,23,11,6};
		
		int search=20;
		int li=0;			//li =lower index
		int hi=a.length-1;	//hi = higher index
		int mi=(li+hi)/2;		//mi = middle index
		
		while(li <= hi)
		{
		
			if(a[mi]==search)
			{
				System.out.println("element is at "+mi+" index position");
				break;
			}
			else if(a[mi]<search)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("element not found");
		}
		
	}

}

