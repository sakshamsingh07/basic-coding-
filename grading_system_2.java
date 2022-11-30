import java.util.Scanner;
public class grading_system_2
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in);
        System.out.print("enter maths marks:");
        int maths = scn.nextInt();
        System.out.print("enter phy marks:");
        int phy = scn.nextInt();
        System.out.print("enter chem marks:");
        int chem = scn.nextInt();
        System.out.print("enter hindi marks:");
        int hindi = scn.nextInt();
        System.out.print("enter eng marks:");
        int eng = scn.nextInt();
        int marks = (maths+phy+chem+hindi+eng);
        System.out.println("total marks obtained ="+ marks);
        //use if else $ else if 
        if (marks>400)
        {
            System.out.print("excellent");
        }
        else if (marks>300 && marks<=400)
        {
            System.out.print("good");
        }
        else if (marks>200 && marks<=300)
        {
            System.out.print("fair");
        }
        else if (marks>100 && marks<=200)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail \n  madharchod ,ab tera baap tera gaand maarega");
        }

    } 
    // or we can use below code also for the function purpose
   // public static int sum(int maths ,int phy, int chem, int hindi, int eng)
   // {
       // return (maths + phy + chem + hindi + eng);
    //}

}