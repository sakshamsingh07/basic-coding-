import java .util.Scanner; 
public class s07_reverseOfNum
{
    public static void reverse(int num)
    {
        while(num!=0)
        {
            int lastdigit = num%10;
            num/=10;
            System.out.println(lastdigit);
        }
 } 
 public static void main(String[] args)
 {
     Scanner scn =new Scanner (System.in);
     int num = scn.nextInt();
     reverse(num);
 }
}
