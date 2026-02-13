import java.util.Scanner;
public class Sumn {
    int sums=0,i=1;
     int sum(int n)
    {
       sums=sums+i;
       if(i==n)
        return sums;
    i++;
     sum(n);
     return sums;
   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
Sumn ob=new Sumn();
System.out.println("sum of first n numbers "+ob.sum(a));
    }
    
}
