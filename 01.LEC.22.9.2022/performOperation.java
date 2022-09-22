import java.util.*;
//WAP to accept choice from user and perform the operation:
//1: factorial
//2:sum of digit
//3:Armstrong number or not
//4:fibonacci series
//5:Prime no or Not
public class performOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		System.out.println("01. Facorial \n02. Sum of Digits \n03. Armstrong or Not \n04. Fibonacci Series \n05. Prime or Not");
		Scanner sc = new Scanner(System.in);
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			fact();
			break;
		case 2:
			sum();
			break;
		case 3:
			arm();
			break;
		case 4:
			fib();
			break;
		case 5:
			prime();
			break;

		default:
			System.out.println("Enter valid option");
			break;
		}

	}
	public static void fact() {
		int i,factorial=1,num;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+num+" is: "+factorial);
	}
	public static void sum() {
		int number, digit, sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = sc.nextInt();  
		while(number > 0)  
		{  
		//finds the last digit of the given number    
		digit = number % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		number = number / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);
	}
	public static void arm() {
		int num,orinum,rem,res=0;
		System.out.println("Enter the Number :");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		orinum=num;
		while(orinum != 0) {
			rem = orinum % 10;
            res = res+rem*rem*rem;
            orinum /= 10;
		}
		if(res==num) {
			System.out.println(num + " is an Armstrong number");
		}
		else {
			System.out.println(num + " is not an Armstrong number");
		}
	}
	public static void fib() {
		int num1=0,num2=1,num3,i,count;
		 System.out.println("Enter the required number for list : ");
		 Scanner sc = new Scanner(System.in);
		 count=sc.nextInt();
		 System.out.print(num1+" "+num2);//printing 0 and 1
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  num3=num1+num2;    
		  System.out.print(" "+num3);    
		  num1=num2;    
		  num2=num3;    
		 }
	}
	public static void prime() {
		int num, i, count=0;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the Number : ");
	      num = sc.nextInt();
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println(+num+" is a Prime Number.");
	      else
	         System.out.println(+num+" is not a Prime Number.");
	      }
}
	


