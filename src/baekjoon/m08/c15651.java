package baekjoon.m08;

import java.util.Scanner;

public class c15651 {

	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		visited = new boolean[N];
		arr = new int[M];

		solution(N, M, 0);
		System.out.println(sb.toString());
	}

	public static void solution(int N, int M, int depth) {
		if (depth == M) {
			for (int i : arr)
				sb.append(i).append(" ");
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i] == false) {	
				arr[depth] = i + 1;
				solution(N, M, depth + 1);
			}
		}
		return;
	}
}
