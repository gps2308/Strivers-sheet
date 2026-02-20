package Arrays;
import java.util.Scanner;
public class Largestelement
{
    public static int largest(int a[],int n)
    {
       int  large=a[0];
        for(int i=0;i<n-1;i++)
        {
         if(a[i]>large)
            large=a[i];
        } return large;
    }
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Size of the array");
        int n=sc.nextInt();
        System.out.println("Enter Elements of Array");
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int largest=largest(a,n);
        System.out.println("Largest Element :"+largest);
    }
}