package Assign;
	import java.util.Scanner;

	public class Factorial {

		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a number...");
			int x = sc.nextInt();

			int fact = 1;
			int i = 1;
			do
			{
				fact = fact * i;
				 ++ i;
			}while ( i <= x);
			
			System.out.println("Factorial of a number is "+ fact);
		}

	}


