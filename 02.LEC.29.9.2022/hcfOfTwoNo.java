import java.util.*;

//WAP to calculate HCF of Two given numbers.

public class hcfOfTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, hcf=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		n1=sc.nextInt();
		System.out.println("Enter the Second Number");
		n2=sc.nextInt();
		

	    for (int i=1;i<=n1||i<=n2;i++)
	      {
	     if (n1%i==0&&n2%i==0)
	        hcf=i;
	      }

	    System.out.println("The HCF of Two Given Numbers is : "+hcf);
	}

}
