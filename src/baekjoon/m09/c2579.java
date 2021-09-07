package baekjoon.m09;

import java.util.Scanner;

public class c2579 {
	static int[] arr;
	static Integer[] tmp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N+1];
		tmp = new Integer[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}

		tmp[0] = arr[0];	
		tmp[1] = arr[1];
		
		if(N >= 2) {
			tmp[2] = arr[1] + arr[2];
		}
		
		System.out.println(solution(N));

	
	}

	public static int solution(int depth) {

		if (tmp[depth] == null) {
			tmp[depth] = Math.max(solution(depth - 2), solution(depth - 3) + arr[depth - 1]) + arr[depth];
		}
		return tmp[depth];
	}
}





/*
 * 6 10 3 2 1 100 100 output: 114 answer: 212
 */
