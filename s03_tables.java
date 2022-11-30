import java.util.Scanner; 
public class s03_tables
{
     public static void table(int num)
     {
         for(int i=1; i<=10; i++)
         {
             System.out.println(num+"X" + i +"="+ num*i);
         }
     } 
    //  tablerange
    public static void tablerange(int a, int b)
    {
        for(int i = a; i<=b; i++)
        {
            table(i);
            System.out.println("================");
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        // int num = scn.nextInt();
        // table(num);
        int a = scn.nextInt();
        int b = scn.nextInt();
        tablerange(a,b);
        
    }
}