package sorting;

import java.util.Scanner;

class Recbubblesort
{
    public static int [] bubble(int a[],int n)
    {
        if(n==1)
            return a ;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
         return bubble(a,n-1);
        
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
          int a[]=bubble(arr,n);
            System.out.println("Sorted array :");
            for(int x: a)
                System.out.println(x+"");
    }
}