import java.util.Scanner;
public class Reversearr {
 
    static void reverse(int n[],int s,int e)
    {
     
        if(s>=e)
            return;
        int m= n[s];
        n[s]=n[e];
        n[e]=m;

        reverse(n,s+1,e-1);
        


    }
    public static void main (String[] args)
    {
Scanner sc= new Scanner(System.in);
int size = sc.nextInt();
int arr[]=new int [size];
for(int j=0;j<size;j++)
    arr[j]=sc.nextInt();
reverse(arr,0,size-1);
for(int x: arr)
    System.out.print(x+"");

    }

}
