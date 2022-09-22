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
		int a,b,sum;
		System.out.println("Enter Numbers to be added :");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is : "+sum);
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
	


