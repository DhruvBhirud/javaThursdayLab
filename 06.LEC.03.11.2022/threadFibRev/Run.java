package threadFibRev;
class Run
{
     public static void main(String[] args)
     {
          try
          {
               Fib fib = new Fib();
               fib.start();
               fib.sleep(4000);
               Rev rev = new Rev();
               rev.start();
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

