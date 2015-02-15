/*
 * write program to calculate power(x,n) in log(n) time
 */

public class Solution {
	public double pow(double x, int n) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			return 1 / power(x, -n);
		} else {
			return power(x, n);
		}
	}

	public double power(double x, int n) {
		if(n == 0) {
			return 1;
		}
		double recursion = power(x, n/2);
		if(n % 2 == 0) {
			return recursion * recursion;
		} else {
			return recursion * recursion * x;
		}
	}
}
// Here we assume that x is non-negative double type
// TLE: input:	0.00001, 2147483647 because I continue do power for 4 times 
// 	in each recursion.
