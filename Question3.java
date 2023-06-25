package in.ineuron;

public class Question3 {

	public static int findMissingNumber(int[] nums) {
		int n=nums.length;
        int expectedSum=(n*(n+1))/2;
        int sum=0;
        for(int element:nums)
        	sum+=element;
        
        return expectedSum-sum;
    }
    
    public static void main(String[] args) {
        int nums[] = {0,7,1,3,5,6,4};
        int result = findMissingNumber(nums);
        System.out.println("Missing number  is " + result);
    }
}
