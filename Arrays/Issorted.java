package Arrays;
import java.util.Scanner;
public class Issorted {
    public static boolean checksort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
if (a[i]>a[i+1])
{
    return false;
}

        }
        return true;
    } 

   public static void main(String args[])
   {
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of the array");
int n= sc.nextInt();
int a[]=new int[n];
System.out.println(" Enter the elements of array");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
if(checksort(a,n))
    System.out.println("Array is Sorted");
else
     System.out.println("Array is not Sorted");
   } 
}
