public class solution
{
    public int SearchInsertposition(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]==target) || target<nums[i])
            {
                return i;
            }
        }
        return nums.length;
    }
}
//second method
public class solution{
    public int SearchInsertposition(int[] num,int target)
    {
        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if(nums[mid]>target)
            {
                high=high-1;
            }
            else if(nums[mid]<target)
            {
                low=low+1;
            }
            mid=low+(high-low)/2;
        }
        return low;
    }
}