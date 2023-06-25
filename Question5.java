package in.ineuron;

public class Question5 {

	public static int findRepeatedNumber(int[] nums) {
		int n=nums.length-1;
        int expectedSum=(n*(n+1))/2;
        int sum=0;
        for(int element:nums)
        	sum+=element;
        
        return sum-expectedSum;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6,6,2};
        int result = findRepeatedNumber(nums);
        System.out.println("Repeated number  is " + result);
    }
}
