import java.util.Scanner;


public class ASSIGNMENT1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter Number 2 : ");
		int num2 = scan.nextInt();
		
		int sum= -num1-num2;
		sum *= -1;
		
		System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
		
		
	}
}
