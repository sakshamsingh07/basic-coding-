import java.util.Scanner; 
public class isPrim
{
    public static void isprim(int num)
    {
       boolean isprim = true;
        for(int i=2; i<num; i++)
        { 
            if (num%i==0)
            {
                isprim = false;
                break;

            }
        }
        if (isprim)
        {
            System.out.println(num+"is prim");
        }
        else 
        {
            System.out.println(num+"is not prim");
        }
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner (System.in);
        int num = scn.nextInt();
        isprim (num);
    }
}