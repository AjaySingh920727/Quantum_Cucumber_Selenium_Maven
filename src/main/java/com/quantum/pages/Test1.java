package com.quantum.pages;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] arr = {1,2,2,2,5,5,5,8};
		
		System.out.println(s.solution(arr));

	}

}

class Solution1 {
    public int solution(int[] A) {
    	
    	Map<Integer, Integer> data = new HashMap<>();
    	
        for (int i = 0; i < A.length; i++) {
            if (data.containsKey(A[i])) {
            	data.put(A[i], data.get(A[i]) + 1);
            } else {
            	data.put(A[i], 1);
            }
        }
        
        int[] moves = {0};
        
        data.forEach((digit, occurrence) -> {
            if (digit != occurrence) {
                if (digit < occurrence) {
                	moves[0] += (occurrence - digit);
                } else if (digit > occurrence) {
                	moves[0] += Math.min(Math.abs(occurrence - digit), occurrence);
                } else {
                	moves[0] += occurrence;
                }
            }
        });
        System.out.println("Minimum occurrences" + moves[0]);
        return moves[0];
    }
}
