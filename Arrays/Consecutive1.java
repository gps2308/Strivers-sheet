package Arrays_easy;
public class Consecutive1
{
    public static int consecutive(int a[])
    {
        int c=0;
        int maxi=0;
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            if(a[i]==1)
                c++;
            else
                c=0;
            maxi=Math.max(maxi,c);

        }
        return maxi;
    }
    public static void main(String a[])
    {
        int arr[]={1,1,1,0,1,1,1,1};
        System.out.println("max consecutive 1's:"+consecutive(arr));
    }
}