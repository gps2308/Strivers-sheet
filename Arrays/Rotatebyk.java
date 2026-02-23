package Arrays;
import java.util.Scanner;;
public class Rotatebyk {

    public static int[] reverse(int a[],int start,int end)
    {
while(start<end)
{
    int temp=a[start];
    a[start]=a[end];
    a[end]=temp;
    start++;
    end--;
}
return a;
    }
public static int[] rotate(int a[],int k,String direction)
{
    int n=a.length;
if(direction.equals("Right"))
{
    reverse(a,0,n-1);
    reverse(a,0,k-1);
    reverse(a,k,n-1);
    
}

else if (direction.equals("Left"))
{
    reverse(a,0,k-1);
    reverse(a,k,n-1);
    reverse(a,0,n-1);
    
}
return a;
}
public static void main (String ags[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of Array");
    int n=sc.nextInt();
    System.out.println("enter no. of times to rotate");
    int k=sc.nextInt();
    System.out.println("Enter Left or Right");
    String s=sc.next();
    int a[]=new int[n];
System.out.println("Enter the Elements of array");
for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
}
int arr[]= rotate(a,k,s);
for(int x: arr)
    System.out.print(x+" ");
}}    

