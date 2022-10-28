import java.util.*;

//WAP to accept number from user in array and find out the average and sum of array numbers

public class arrayAvgSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int size,i,sum = 0,avg;
		//taking input from user
		System.out.println("Enter size : ");
		size=sc.nextInt();
		int no[]=new int[size];
		System.out.println("Enter "+size+" numbers:");
		//using for to find the sum of total numbers in array
		for(i=0;i<size;i++) {
			no[i]=sc.nextInt();
		}
		for(i = 0; i < no.length; i++) {
			sum += no[i];
		}
		avg=sum/size;
		//Displaying the output
		System.out.println("Sum of all elements in array is : "+sum);
		System.out.println("Average of all elements in array is : "+avg);
	}

}
