import java.util.Scanner;
public class Factorial {
    static int f=1;
    static int factorialn(int n)
    {
      f=f*n;
if(n==1)
    return f;
factorialn(n-1);
return f;
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(factorialn(a));
    }
}
