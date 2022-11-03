package messageDisplayThread;
import java.io.*;

public class messageDisplay
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Thread1 t1 = new Thread1("Hello");
        Thread1 t2 = new Thread1("World!");
        t1.start();
        t2.start();
        System.out.println("Press Enter to exit");
		String s = br.readLine();
		System.exit(0);
    }
}