import java.util.*;

//WAP to accept a number from user and then print the sum of the even and odd numbers.

public class sumOfEvenOdd {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num,evensum=0,oddsum=0;
		char ans;
		do {
			//Taking input from user
			System.out.println("Enter the number");
			num=sc.nextInt();
			//checking if number is even or odd
			if(num%2==0) {
				//if even add the number in evensum integer
				evensum+=num;
			}
			else {
				//if odd add the number in oddsum integer
				oddsum+=num;
			}
			//asking user if he/she wants to add another number
			System.out.println("Do you want to add another number? y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		//if ans is no or n then loop ends and all the updated values are displayed
		System.out.println("Addition of all Even Numbers is : "+evensum);
		System.out.println("Addition of all Odd Numbers is : "+oddsum);
	}
	

}
