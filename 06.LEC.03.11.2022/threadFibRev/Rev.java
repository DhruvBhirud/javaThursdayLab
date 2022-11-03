package threadFibRev;
class Rev extends Thread
{
     public void run()
     {
          try
          {
               System.out.println("\nReverse is of 1 to 10 is : ");
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+" ");
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

