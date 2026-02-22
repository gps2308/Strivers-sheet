package Arrays;
import java.util.Scanner;
public class Shiftzerotolast
{
    public static int[] movezero(int a[],int n)
    {
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                j=i;
                break;
            }
        
        }
        if(j==-1)
            return a;
        for (int i=j+1;i<n;i++)
        {
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        return a;
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
int arr[]=movezero(a,n);
System.out.println("Updated Array");
for(int x:arr)
{
    System.out.print(x+" ");
}
    }
}