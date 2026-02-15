package sorting;

import java.util.Scanner;

public class Quicksort
{
    public static int[] quicksort(int a[],int low,int high)
    {
        if(low<high)
        {
            int pivotindex=function(a,low,high);
            quicksort(a,pivotindex+1,high);
            quicksort(a,low,pivotindex-1);

        }
        return a;
    }
    public static int function(int a[],int low,int high)
    {
int pivot=low;
int i=low;
int j=high;
while (i<j)
    {while (a[i]<a[pivot]&&i<=high) {
        i++;
        
    }
    while (a[j]>a[pivot]&&j>=low) {
        j--;
        
    }
if (i<j) {
    int temp=a[j];
    a[j]=a[i];
    a[i]=temp;
    
}

} 
int temp2=a[low];

a[low]=a[j]; 
a[j]=temp2; 
 

return j;
    
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
          int a[]=quicksort(arr,0,n-1);
            System.out.println("Sorted array :");
            for(int x: a)
                System.out.println(x+"");
}
    }

