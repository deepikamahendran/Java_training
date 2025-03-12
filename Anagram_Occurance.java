package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String txt = s.nextLine();
		String pat = s.nextLine();
		int count =0;
		int n = txt.length();
		int m = pat.length();
		
		char[] patArr = pat.toCharArray();
		Arrays.sort(patArr);
		
		for(int i=0;i<=n-m;i++)
		{
			char[] subArr = txt.substring(i,i+m).toCharArray();
			Arrays.sort(subArr);
			if(Arrays.equals(patArr,subArr))
				count++;
		}
		System.out.print(count);
		
	}
}


