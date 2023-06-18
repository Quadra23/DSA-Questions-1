
public class DSA_Mock_Q1 {
	
	    public static int mySqrt(int x) {
	        if (x == 0)
	            return 0;
	        
	        int left = 1;
	        int right = x;
	        int ans = 0;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (mid <= x / mid) {
	                ans = mid;
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        return ans;
	    }

	    public static void main(String[] args) {
	        int x1 = 4;
	        System.out.println("Square root of " + x1 + ": " + mySqrt(x1));

	        int x2 = 8;
	        System.out.println("Square root of " + x2 + ": " + mySqrt(x2));
	    }
	}

