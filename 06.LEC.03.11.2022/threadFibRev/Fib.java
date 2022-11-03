package threadFibRev;
class Fib extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0, n=10;
               System.out.println("Fibonacci series first 10 terms are :");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

