import java.util.*;

//WAP to calculate HCF of Two given numbers.

public class hcfOfTwoNo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n1, n2, hcf=0;
		//Taking input from user for 1st number
		System.out.println("Enter the First Number");
		n1=sc.nextInt();
		//Taking input from user for 2nd number
		System.out.println("Enter the Second Number");
		n2=sc.nextInt();
		//using for loop to HCF [Highest Common Factor] we initialize i in this loop
	    for (int i=1;i<=n1||i<=n2;i++)
	      {
	    	//checking if both numbers are completely divided by i with if conditional statement
	     if (n1%i==0&&n2%i==0)
	        hcf=i;
	      }
	    //Display the HCF
	    System.out.println("The HCF of Two Given Numbers is : "+hcf);
	}

}
