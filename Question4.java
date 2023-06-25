package in.ineuron;


import java.util.HashSet;
import java.util.Set;

public class Question4 {

	public static Set<Integer> findIntersection(int[] nums1,int[]nums2) {
		Set<Integer> set =new HashSet<Integer>();
		Set<Integer> list=new HashSet<Integer>();
		for(int element:nums1) {
			set.add(element);
		}
		 
		for(int element:nums2) {
			if(set.contains(element)) {
				list.add(element);
			}
		}
		return list;
		
    }
    
    public static void main(String[] args) {
    	int[] nums1={4,9,5}, nums2 = {9,4,9,8,4};
        Set<Integer> res = findIntersection(nums1,nums2);
        System.out.println(res.toString());
    }
}
