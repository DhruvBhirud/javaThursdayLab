package prodConsSync;
public class ProdCons
{
      public static void main(String[] args)
      {
            Shop c = new Shop();
            Prod p1 = new Prod(c, 1);
            Cons c1 = new Cons(c, 1);
            p1.start();
            c1.start();
      }
}
