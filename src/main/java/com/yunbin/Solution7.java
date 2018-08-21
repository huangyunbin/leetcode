package com.yunbin;

import java.util.ArrayList;
import java.util.List;

/**
 Given a 32-bit signed integer,reverse digits of an integer.

 Example 1:

 Input:123
 Output:321
 Example 2:

 Input:-123
 Output:-321
 Example 3:

 Input:120
 Output:21
 Note:
 Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:[−231,231 − 1].For the purpose of this problem,assume that your function returns 0when the reversed integer overflows.
 **/
class Solution7 {


	public int reverse(int x) {

		List<Integer> temps = new ArrayList<>();

		for (; ; ) {
			temps.add(x % 10);
			x = x / 10;
			if (x ==0) {
				break;
			}
		}

		int result = 0;
		int num = 1;
		for (int i = 0; i < temps.size(); i++) {
			result += temps.get(temps.size()-1- i) * num;
			num = num * 10;
		}

		return result;
	}
}