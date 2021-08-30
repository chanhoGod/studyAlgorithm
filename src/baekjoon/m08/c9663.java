package baekjoon.m08;

import java.util.Scanner;

public class c9663 {
	static int[] visited;
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		visited = new int[N];
		solution(N, 0);
		System.out.println(count); 
	}

	public static void solution(int N, int depth) {
		if (depth == N) {
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			visited[depth] = i;
			if (check(depth)) {
				solution(N, depth + 1);
			}
		}

	}

	public static boolean check(int depth) {
		//가로
		for(int i = 0; i < depth; i++) {
			if(visited[i] == visited[depth]) {
				return false;
			}else if(Math.abs(depth - i) == Math.abs(visited[depth] - visited[i])) {
				return false;
			}
		}
		
		return true;
	}
}
