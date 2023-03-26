import java.util.Scanner;

public class UsersInputArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number for Array Size");
		int size = scanner.nextInt();
		int a[] = new int [size];
		
		for(int i=0; i<a.length; i++) 
		{
			a[i] = scanner.nextInt();
		}

		for(int i=0; i<a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
		scanner.close();
	}
}
