import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int ans = sum(n1, n2);
        System.out.println(ans);
    }
    public static int sum(int a, int b){
        return (a+b);
    }
    
}
