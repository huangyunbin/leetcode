package com.yunbin;

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

		StringBuilder stringBuilder = new StringBuilder();
		String first = "";
		if (x < 0) {
			first = "-";
			x=Math.abs(x);
		}

		for (; ; ) {
			stringBuilder.append(x % 10);
			x = x / 10;
			if (x == 0) {
				break;
			}
		}

		String s = first+stringBuilder.toString();


		try {
			return Integer.valueOf(s);
		} catch (Exception e) {
			return 0;
		}


	}
}