package Arrays_easy;

public class Longestsubarraypositive {
    public static int subarray(int a[],int k)
    {
        int left=0;int right =0;
        int maxlen=0;
        int n=a.length;
        int sum=a[left];
        while(right<n){
        while(sum>k && left<=right)
        {
            sum=sum-a[left];
            left++;
        }
        if(sum==k)
        {
            maxlen=Math.max(maxlen,right-left+1);

        }
      right++;
    
            if (right < n) {
                sum += a[right];
            }
        }
            return maxlen;
         }

         public static void main(String args[])
         {
            int a[]={1,2,3,1,1,1,1,3,3};
             int k=6;
             System.out.println("longest subarray length:"+subarray(a, k));
         }
    } 
    

