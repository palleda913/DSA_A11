package in.ineuron;

public class Question2 {

	public static int findPeakElement(int[] nums) {
       for(int i=1;i<nums.length-1;i++) {
    	   if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
    		   return i;
       }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,5,6,4};
        int result = findPeakElement(nums);
        System.out.println("Peak element at index  is " + result);
    }
}
