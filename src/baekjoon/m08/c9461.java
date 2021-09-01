package baekjoon.m08;

import java.util.Scanner;

public class c9461 {
	static long[] saved;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] arr = new long[T];
		saved = new long[102];
		saved[0] = 0;
		saved[1] = 1;
		saved[2] = 1;
		for (int i = 0; i < T; i++) {
			long a = solution(sc.nextInt());
			arr[i] = a;
		}

		for (long i : arr) {
			System.out.println(i);
		}
	}

	public static long solution(int N) {
		if (N <= 0)
			return saved[0];
		if (N == 1)
			return saved[1];
		else if (N == 2)
			return saved[2];
		
		if(saved[N] != 0)
			return saved[N];
		
		saved[N] = solution(N - 2) + solution(N - 3);
		return saved[N];
	}
}
