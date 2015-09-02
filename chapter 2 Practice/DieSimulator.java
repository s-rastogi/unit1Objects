
import java.util.Random;


public class DieSimulator
{
    public static void main(String[] args)
    {
      Random roller= new Random();
      int num = roller.nextInt(6)+1;
      System.out.println(num);
    }
}   
    
 