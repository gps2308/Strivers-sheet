package sorting;

import java.util.Scanner;

public class Recinsertion {
    public static int[] insertion(int a[],int n,int index)
    {
    
         if(n==index)
                return a;
        int j=index;
        while(j>0&&a[j-1]>a[j])
        {
            int temp=a[j-1];
            a[j-1]=a[j];
            a[j]=temp;
            j--;
        }

        
 return insertion(a,n,index+1);

    }
   public static void main(String args[])
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
          int a[]=insertion(arr,n,1);
            System.out.println("Sorted array :");
            for(int x: a)
                System.out.print(x+" ");
} 
}
