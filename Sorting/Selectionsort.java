import java.util.Scanner;
public class Selectionsort{
public static int[] selecsort(int a[],int n)
{
    for(int i=0;i<n-1;i++)
      
    {
          int mini=i;
        
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[mini])
            {
            mini=j;
            
}


        }
        int temp=a[i];
            a[i]=a[mini];
            a[mini]=temp;
      
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
          int a[]=selecsort(arr,n);
            System.out.println("Sorted array :");
            for(int x: a)
                System.out.println(x+"");
    }
}

