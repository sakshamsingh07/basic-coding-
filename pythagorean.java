import java.util.Scanner; 
public class pythagorean
{
    public static void pytha(int h , int p, int b)
    {
        boolean pytha = false;
        if (h*h == p*p + b*b)
        {
            pytha = true;
            System.out.println(pytha);
        }
        else if (p*p == h*h + b*b)
        {
            pytha = true;
            System.out.println(pytha);
        }
        else if (b*b == h*h + p*p)
        {
            pytha = true;
            System.out.println(pytha);
        }
    
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int h = scn.nextInt();
        int b = scn.nextInt();
        pytha(h,p,b);
    }
}