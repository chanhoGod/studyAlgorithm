package baekjoon.m09;

import java.util.Scanner;
//못품

public class c1149 {
	static int[][] arr;
	static int[][] saved;
	static int N;
	final static int red = 0;
	final static int green = 1;
	final static int blue = 2;
	static int r = 0;
	static int g = 0;
	static int b = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		arr = new int[N][3];
		saved = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(0, red);
		solution(0, green);
		solution(0, blue);
		System.out.println(saved[0][0]);
	}

	public static int solution(int down, int color) {
		
		return 0;
	}

}
