package baekjoon.m09;

import java.util.Scanner;

public class c1932 {
	static int[][] arr;
	static int[][] saved = new int[500][500];
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[500][500];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		solution(0, 0);
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print(saved[i][j] + " ");
//			}
//			System.out.println();
//		}
		if(N == 1) {
			System.out.println(arr[0][0]);
		}else {
			System.out.println(saved[0][0]);			
		}

	}

	public static int solution(int depth, int start) {
		if (depth < N - 1) {
			if (saved[depth][start] == 0) {
				int num = Math.max(solution(depth + 1, start), solution(depth + 1, start + 1));
				saved[depth][start] += (num + arr[depth][start]);
			} else
				return saved[depth][start];

		} else
			return arr[depth][start];
		return saved[depth][start];

	}

}
