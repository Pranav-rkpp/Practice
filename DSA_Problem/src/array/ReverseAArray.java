package array;

public class ReverseAArray {
	public static int[] reverseArray(int[] nums) {
        int start=0,end=nums.length-1;
        System.out.println(nums.length);
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
  }
	public static void main(String[] args) {
	    int[] nums={1,3,2,4,6,8};
	     for(int element : nums)
	    {
	        System.out.print(element + " ");
	    }
	    System.out.println();
	    nums=reverseArray(nums);
	    for(int element : nums)
	    {
	        System.out.print(element + " ");
	    }
	}
}
