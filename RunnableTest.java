import java.lang.Runnable;

class A implements Runnable
{
  public void run()
  {
    for(int i=1;i<=10;i++)
     {
       System.out.println("\n ThreadA i = " +i);
     }
    System.out.println("End of Thread A");
  }
}

class B implements Runnable
{
  public void run()
  {
    for(int j=1;j<=10;j++)
     {
       System.out.println("\n Thread B j= " +j);
     }
    System.out.println("End of Thread B");
  }
}


class RunnableTest
{
   public static void main(String args[])
   {
     A runnable1 = new A();
     Thread threadX = new Thread(runnable1);
     threadX.start();
     B runnable2 = new B();
     Thread thready = new Thread(runnable2);
     thready.start();
     System.out.println("End of main Thread");

   }
}