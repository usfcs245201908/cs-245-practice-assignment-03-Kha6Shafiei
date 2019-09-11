
public class LinearSearch implements Practice03Search{
	
	public int search(int [] nums , int target) {
		if(nums == null || nums.length == 0) {
			
			throw new IllegalArgumentException ("Array is empty.");
			
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(target == nums[i]) return i;
		}
		
		return -1;
	}
	
	
	public String searchName() {
		
		return "Linear Search";
	}

}
