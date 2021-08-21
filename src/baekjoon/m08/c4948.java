package baekjoon.m08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while (true) {
			int N = sc.nextInt();
			if (N != 0) {
				list.add(solution(N));
			} else {
				break;
			}
		}
		for (int i : list) {
			System.out.println(i);
		}
	}

	public static int solution(int N) {
		int count = 0;
		int[] arr = new int[2 * N];
		double d = Math.sqrt(2 * N);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int j = 2; j <= d; j++) {
			for (int i = j*j -1; i < arr.length; i+=j) {
				if (arr[i] == 1)
					continue;
				if (arr[i] % j == 0 && arr[i] != j) {
					arr[i] = 1;
				}
			}

		}
		for (int i = N; i < arr.length; i++) {
			if (arr[i] != 1) {
				count++;
			}
		}

		return count;
	}
}
