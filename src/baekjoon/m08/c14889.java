package baekjoon.m08;

import java.util.Scanner;

public class c14889 {
	static int N;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		visited = new boolean[N];
		solution(0);
	}
	
	
	public static void solution(int count) {
		
		if(count == N/2) {
			
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(visited[i] == false) {
				visited[i] = true;
				solution(count + 1);
				
			}
		}
		
	}
	
}
