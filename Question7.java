package in.ineuron;

public class Question7 {

	public static int[] findElement(int[] nums,int target) { 
		int[] res=new int[2];
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(nums[mid]==target) {
				if(nums[mid+1] == target ) {
					res[0]=mid;
					res[1]=mid+1;
				}
				
				else if(nums[mid-1] == target) {
					res[0]=mid-1;
				    res[1]=mid;
				}
				return res;
			}else if(nums[mid]<target)
				start=mid+1;
			else
				end=mid-1;
		}
		res[0]=-1;
		res[1]=-1;
		return res;
    }
    
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target =7;
        int result[] = findElement(nums,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
