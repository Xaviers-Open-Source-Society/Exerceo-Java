import java.io.*;
public class e1s
{
  public static void main()
    {
    int i, s=0;
    for (i=1;i<=1000;i++)
      {
      if ((i%3==0)||(i%5==0))
      s=s+i;
      }
    System.out.println("Sum = "+s);
  }
}
