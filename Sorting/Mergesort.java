package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Mergesort {
   public static int[] mergesort(int a[],int low,int high)
    {
        if(low>=high)
            return a;
        else{
            int mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);

        }
        return a;
    }
   public static void merge(int a[],int low,int mid,int high)
    {
        ArrayList <Integer> temp=new ArrayList<>();
        int left=low;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(a[left]<a[right])
            {
                temp.add(a[left]);
                left++;
            }
            else{
                temp.add(a[right]);
                right++;
            }

        }
        while(right<=high){

            temp.add(a[right]);
            right++;
        }
        while(left<=mid)
        {
            temp.add(a[left]);
            left++;
        }
        for(int i=low;i<=high;i++)
        {
            a[i]=temp.get(i-low);
        }
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
          int a[]=mergesort(arr,0,n-1);
            System.out.println("Sorted array :");
            for(int x: a)
                System.out.println(x+"");
}
}
