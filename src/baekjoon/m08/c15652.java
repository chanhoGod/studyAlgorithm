package baekjoon.m08;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class c15652 {
	static int[] arr;
	static boolean[] visited;
	static Set<int[]> set = new HashSet<>();
	static int start = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		arr = new int[M];
		visited = new boolean[N];

		solution(N, M, 0, start);
	}

	public static void solution(int N, int M, int depth, int idx) {

		if (depth == M) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		for (int i = idx; i < N; i++) {
			arr[depth] = i + 1;
			solution(N, M, depth + 1, idx++);
		}
		return;
	}
}
