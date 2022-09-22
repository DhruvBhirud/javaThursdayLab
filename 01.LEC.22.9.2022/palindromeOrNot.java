import java.util.Scanner;
//WAP to accept a number from the user and check if a given number is palindrome or not.
public class palindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing number reverse number and remainder
		int num,revnum=0,rem;
		//Getting input from user
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		//Initializing Original number
		int orinum=num;
		//Using while loop to reverse the number
		while(num != 0) {
			rem=num%10;
			revnum=revnum*10+rem;
			num /= 10;
		}
		//Check if Original number matches the reverse number or not i.e. palindrome or not
		if (orinum == revnum) {
		      System.out.println(orinum + " is a Palindrome.");
		    }
		    else {
		      System.out.println(orinum + " is not a Palindrome.");
		    }

	}

}
