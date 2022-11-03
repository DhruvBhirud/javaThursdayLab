package messageDisplayThread;
class Thread1 extends Thread
{
    String msg;
    Thread1(String msg)
    {
        this.msg = msg;
    }
    public void run()
    {
        while(true)
        {
            System.out.println(msg);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}