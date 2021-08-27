package baekjoon.m08;

import java.util.Scanner;

public class c15650 {
	static boolean[] visited;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		visited = new boolean[N];
		arr = new int[M];
		
		back(N, M, 0, 0);
	}
	
	public static void back(int N, int M, int depth, int start) {
		if(depth == M) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		
		
		for(int i = start; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				back(N, M, depth + 1, start);
				visited[i] = false;
			}
			start++;
		}
		return;
	}
}
