//bitwise operator -> And(&) nd or(|)

// & 11-> 1 rest is 0
// | 1 0 -> 1
// | 0 0 -> 0
// | 0 1 -> 1
public class bitwise
{
   public static void main (String args[])
    {
      
        int a =25;//11001
        int b=15; //01111
                  //11111 -> 31
                 //01001  -> 9
        int c= a&b;
        int c= a|b;
        Sysstem.out.println(c);
     }
}