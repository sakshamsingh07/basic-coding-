import java.util.Scanner; 
public class s06_pythagoras
{
    public static void pythagoras(int a,int b, int c)
    {
        boolean pythagoras = false;
        if(a*a == b*b +c*c)
        {
            pythagoras = true;
        }
        else if (b*b == c*c + a*a)
        {
            pythagoras = true;
        }
        else if (c*c == a*a + b*b)
        {
            pythagoras = true;
        }
        if (pythagoras)
        {
            System.out.println(pythagoras+ "   " +"pytha triplet");
        }
        else
        {
            System.out.println(pythagoras+"not pytha triplet");
        }

    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        pythagoras(a,b,c);
    }
}
