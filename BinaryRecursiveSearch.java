
public class BinaryRecursiveSearch implements Practice03Search{
	
	
	public int search(int target, int[] nums , int low, int high) {
		
		if(nums == null || nums.length == 0) {
			
			throw new IllegalArgumentException ("Array is empty.");
			
		}
		
		int mid = (low + high) / 2;
		
		if(high < low)  return -1;
		
		if (target == nums[mid]) return mid;
		
		if (target < nums[mid])  return search(target, nums, low, mid - 1);
		
		if(target > nums[mid] )  return search(target, nums, low + 1 , high);
		
		return -1;
		
	
	}
	
	public String searchName() {
		
		return "Binary Recursive Search";
	}

}
