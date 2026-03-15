//sort 0 1 and 2
class Dutchnationalflag{
    public static void sort(int a[])
    {
        int n=a.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if (a[mid]==0)
            {
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                mid++;
                low++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
            high--;            }
            
        }
        for (int x:a)
        System.out.print(x+",");
    }
    public static void main(String args[])
    {
        int a[]={0,1,2,2,0,0,1};
        sort(a);
    }

}