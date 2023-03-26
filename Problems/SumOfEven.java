import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number for Array Size");
		int size = scanner.nextInt();
		int a[] = new int [size];
		
		System.out.println("Enter Elements in Array");
		for(int i=0; i<a.length; i++) 
		{
			a[i] = scanner.nextInt();
		}

		//Sum of Even
		int sum = 0;
		for(int i=0; i<a.length; i++) 
		{
			if(a[i]%2 == 0) 
			{
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of Even is "+sum);
		
		//Sum of Odd
				int sumOdd = 0;
				for(int i=0; i<a.length; i++) 
				{
					if(a[i]%2 != 0) 
					{
						sumOdd = sumOdd + a[i];
					}
				}
				System.out.println("Sum of Odd is "+sumOdd);
		
		//sum of all
		int sumAll=0;
		for(int i=0; i<a.length; i++) 
		{
			sumAll += a[i];
		}
		System.out.println("Total Sum is "+sumAll);
		scanner.close();
	}
}
