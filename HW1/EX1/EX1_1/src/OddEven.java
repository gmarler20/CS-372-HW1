import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num;
		
	do  {
		System.out.println("Enter a number between 10 and 100");
		num = scnr.nextInt();
	} while(num < 10 ||num > 100);
	
		for(int i = 1; i < num + 1; i++) {
			System.out.print(i + " ");
			if(i % 2 == 0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
	}
}
