package baekjoon.m08;


import java.util.Scanner;

public class c2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int arr[] = new int[T];
		for (int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			arr[i] = solution(k, n);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int solution(int k, int n) {
		int arr[][] = new int[15][15];

		for (int i = 0; i <= k; i++) {
			int index = 0;
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					int idx = 0;
					idx += j + 1;
					arr[i][j] = idx;
				}else {
					index += arr[i-1][j];
					arr[i][j] = index;
				}
			}
		}

		return arr[k][n-1];
	}
}
