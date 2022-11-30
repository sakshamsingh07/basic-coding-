import java.util.Scanner; 
public class palindrome 
{
    public static void plain(int []arr)
    {
        int i =0 ;
        int j=arr.length-1;
        while(i<=j)
        {
            if(arr[i]==arr[j])
            {
                i++;
                j--;              
            }
            else
            {
               return ;
            }
            
        }
        System.out.println("plaindrome");
    }
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int []arr=new int [n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        plain(arr);
    }
    
}
