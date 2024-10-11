class FindSquareRoot {

	static int findSquareRoot(int no) {
	
		int sqrt = 0;

		/*for(int i = 1 ; i <= no ; i++ ) {

			if(i*i <= no) {
			
				sqrt = i;
			}
			
		}
		return sqrt;
		
		*/

		/*
		 for(int i = 1 ; i <= no ; i++) {
		
			if(i*i <= no) {
			
				sqrt = i;
			}
			else
				break;
		}

		return sqrt;

		*/

		int start = 1;
		int end = no;
		int ans = 0;
		
		while(start <= end) {
		
			int mid = (start+end) /2;
			int sqr = mid*mid;

			if(sqr == no) {
			
				return mid;
			}
			if(sqr > no) {
			
				end = mid-1;
			}else {
				
				ans = mid;
				start = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
	
		int no = 17;
		System.out.println(findSquareRoot(no)); 
	}
}
