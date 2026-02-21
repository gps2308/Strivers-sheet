package Arrays;

import java.util.Scanner;

public class Secondlargest
{
    public static int secondlarge(int a[],int n)
    {
        int secondlargest=Integer.MIN_VALUE,largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>largest)
            {
               
                secondlargest=largest;
                 largest=a[i];
            }
            else if(a[i]<largest && a[i]>secondlargest)
                secondlargest=a[i];
        }
        if (secondlargest==Integer.MIN_VALUE) {
            System.out.println("no second largest element exist");
            return Integer.MIN_VALUE;
        }
        return secondlargest;

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
        int secondlargest=secondlarge(a,n);
        System.out.println(" Second Largest Element :"+secondlargest);
    }
}