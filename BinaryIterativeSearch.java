
public class BinaryIterativeSearch implements Practice03Search{
	
	public int search(int [] nums,  int target) {
		
		if(nums == null || nums.length == 0) {
			
			throw new IllegalArgumentException ("Array is empty.");
			
		}
		
		int low = 0;
		int high = nums.length - 1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(target == nums[mid]) return mid;
			
			if(target < nums[mid]) high = mid -1 ;
			
			if(target >  nums[mid]) low = mid + 1;
			
			
		}
		
		return -1;
		
	}
	
	public String searchName() {
		
		return "Binary Iterative Search";
	}
	
}
	


