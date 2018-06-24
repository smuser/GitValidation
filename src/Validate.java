import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		if(i%2==0)
		{
			System.out.println("Number is even number");
		}
		else
			System.out.println("Number is odd number");
		
	}                                                                                                                                                                                                                                                                                                                                                                                                                                       

}
