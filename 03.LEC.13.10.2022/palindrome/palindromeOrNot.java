import java.util.*;
//WAP to create a class which contain the method Palindrome, the second class will use the proerty of first class and display the output.

public class palindromeOrNot {
	static Scanner sc = new Scanner(System.in);

	public static void palindrome() {
		//Initializing number reverse number and remainder
				int num,revnum=0,rem;
				//Getting input from user
				System.out.println("Enter the Number : ");
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
