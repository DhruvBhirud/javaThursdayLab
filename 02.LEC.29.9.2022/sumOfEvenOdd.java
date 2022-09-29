import java.util.*;

//WAP to accept a number from user and then print the sum of the even and odd numbers.

public class sumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,evensum=0,oddsum=0;
		char ans;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the number");
			num=sc.nextInt();
			if(num%2==0) {
				evensum+=num;
			}
			else {
				oddsum+=num;
			}
			System.out.println("Do you want to add another number? y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		System.out.println("Addition of all Even Numbers is : "+evensum);
		System.out.println("Addition of all Odd Numbers is : "+oddsum);
	}
	

}
