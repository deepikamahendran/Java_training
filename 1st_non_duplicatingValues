import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    System.out.print("The sorted elements :");
		int a[]= {11,2,2,23,11,14,14,5};
		int temp=0;
		int dupe=0;
		for(int i=0; i<(a.length); i++) 
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("1st non repeating element :");
		for( int i=0; i<(a.length); i++) 
		{
			if(i==0||a[i]==a[i-1]) 
			{
				
				continue;
			}
			else{
			    System.out.print(a[i]+" ");
			    break;
			}
			
		}
		/*System.out.println();
		System.out.print("Only duplicates :");
		for( int i=0; i<(a.length)-1; i++) 
		{
			if(a[i]==a[i+1]) 
			{
				System.out.print(a[i]+" ");
			}
		}*/

	}
}
