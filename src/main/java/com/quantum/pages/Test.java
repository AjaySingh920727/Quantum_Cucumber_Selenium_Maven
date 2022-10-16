package com.quantum.pages;

public class Test {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {1,1,3,4,4,4};
		
		System.out.println(s.solution(arr));

	}

}

class Solution {
    public int solution(int[] A) {
    	int moves = 0;
    	int dataLength = A.length;
    	
        for(int i = 0, j = 0; i < dataLength; i = j) {
        	
            while (j < dataLength && A[i] == A[j]) {
            	j++;
            }
            
            int occurrence = j - i;
            
            moves += Math.min(Math.abs(A[i] - occurrence), occurrence);
        }
        return moves;
    }
}
