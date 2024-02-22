package JavaScript.Question31;

import java.util.Arrays;

public class Min_Differnce {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] arr = {7,3,2,4,9,12,56};
		int m=3;
			Arrays.sort(arr);
		int min_diff = Integer.MAX_VALUE;

		
		for(int i=0;i<arr.length;i++) {
		if(i+m-1>=arr.length) {
			break ;
		}
			int diff = arr[i+m-1]-arr[i];
			
			min_diff= Math.min(min_diff, diff);
		}
		
		System.out.println(min_diff);
	}

}
