import java .util.Scanner; 
public class s08_benjaminBulb
{
    public static void benjamin(int num)
    {
        for(int i=1; i*i<=num; i++)
        {
            System.out.println(i*i);

        }
    }
    public static void main( String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        benjamin(num);
    }
}
