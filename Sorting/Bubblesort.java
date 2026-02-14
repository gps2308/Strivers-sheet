package sorting ;
import java.util.Scanner;

public class Bubblesort {
    public static int[] bubsort(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
   
     public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
          System.out.println("enter elements of array");
          for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
          int a[]=bubsort(arr,n);
            System.out.println("Sorted array :");
            for(int x: a)
                System.out.println(x+"");
    }
}
    

