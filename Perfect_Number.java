package assesment;
import java.util.Scanner;
public class perfect_Number 
{
	public static int sumOfDivisors(int num) 
	{
	        int sum = 0;
	        for (int i = 1; i <= num / 2; i++) 
	        {
	            if (num % i == 0) 
	            {
	                sum =sum + i;
	            }
	        }
	        return sum;
	}
	    public static String checkNumberType(int num) 
	    {
	        int sum = sumOfDivisors(num);
	        if (sum == num) 
	        {
	            return "Perfect Number";
	        }
	        else if (sum > num) 
	        {
	            return "Abundant Number";
	        }
	        else 
	        {
	            return "Deficient Number";
	        }
	    }
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        System.out.println(num + " is a " + checkNumberType(num));
	    }
}
