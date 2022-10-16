package com.quantum.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] arr = { 51,71,17,42 };
		int[] arr2 = { 42,33,60 };
		int[] arr3 = { 51,32,43 };

		System.out.println(s.solution(arr));
		System.out.println(s.solution(arr2));
		System.out.println(s.solution(arr3));
		

	}

}

class Solution2 {
	public int solution(int[] A) {
		HashMap<Integer,Integer> dataMap = new HashMap<>();
		
	    int max = -1, a = 0, b = 0;
	    int len = A.length;
	    
	    for (int i = 0; i < len; i++) {
	 
	        // Store the current sum of digits of the numbers in value variable
	        int value = sumOfValues(A[i]);
	 
	        // If value is already present in the dataMap then update maxValue 
	        // if the sum is greater than the existing value
	        
	        if (dataMap.containsKey(value)) {
	            if (A[i] + dataMap.get(value) > max) {
	                a = A[i];
	                b = dataMap.get(value);
	                max = a + b;
	            }
	            dataMap.put(value, Math.max(A[i], dataMap.get(value)));
	        }
	        else
	        // Change the value in the map
	        	dataMap.put(value, A[i]);
	         
	    }
	 
	    System.out.print(a+ " " +  b
	        + " " +  max +"\n");
	    
	    return max;
	}

	private int sumOfValues(double n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
}
