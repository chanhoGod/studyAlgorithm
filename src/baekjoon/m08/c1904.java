package baekjoon.m08;

import java.util.Scanner;

public class c1904 {
	static int[] save = new int[1000001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		save[0] = 1;
		save[1] = 1;
		System.out.println(solution(N));

	}

	public static int solution(int N) {
		if(N == 1) {
			return save[1];
		}else if(N == 0) {
			return save[0];
		}
		if(save[N] != 0)
			return save[N];
		save[N] = (solution(N - 1) + solution(N - 2))%15746;
		
		return save[N];
	}
}
