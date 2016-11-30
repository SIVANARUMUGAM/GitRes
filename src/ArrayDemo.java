import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] =new int[10];
		
		int[] arr1={100,100,200,200,300,300,200,100,400};
		
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length; i++)
		{
			//System.out.println("Array Index "+i+"th Value is "+arr[i]);
			//int temp= (int) arr[i];
			//System.out.println(temp);
			
			if(set.add(arr[i])==false)
			{
				System.out.println("Dupluicate"+arr[i]);
			}
				
			/*if(temp==arr[i])
				{
					System.out.println("Duplicate "+ arr[i]);
					break;
				}*/
			
				
			
		}
		int equal=arr1[0];
		for (int j=0;j<arr1.length;j++)
		{
			if(set.add(arr1[j])==false)
			{
				System.out.println("Dupl "+ arr1[j]);
			}
			//System.out.println("Array Index "+j+"th Value is "+arr1[j]);
			if(arr1[j]>equal)
				
				equal=arr1[j];
				arr1[j]=equal;
			
				
				//System.out.println("duplicate "+arr1[j]);	
		}
			
		System.out.println("Max "+equal);
		
		
		//Finding Duplicate element
		
		int dup=arr1.length;
		int temp=0;
		
		for(int m=0; m<dup; m++)
		{
			for(int n=m+1;n<dup-1;n++)
			{
				if(arr1[n-1]>arr1[n])
				{
					temp=arr1[n-1];
					arr1[n-1]=arr1[n];
					arr1[n]=temp;
					
				}
					
			}
			System.out.println("The Sorting elements are " + Arrays.toString(arr1));
		}
		
		
		
		int dup1=arr1.length;
		
		for(int d=0; d<dup1-1;d++)
			
		{
			for(int c=d+1;c<dup1;c++)
			{
				if(arr1[d]==arr1[c])
				{
					System.out.println("The Duplicate are  " +arr1[c]);
					break;
				}
			}
			
		}
		
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		 
        HashSet<String> set1 = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set1.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
		
        
        
        for(int arr1of:arr1)
        {
        	System.out.println("The elements are  "+arr1of);
        	System.out.println(arr1of);
        }
	}

	
}
