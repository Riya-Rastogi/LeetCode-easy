public class Solution{
    public int removeElements(int[],int val)
    {
        int arr[] = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
        return k

    }
    
}