package baekjoon;

import java.util.Scanner;

public class c1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));

	}

	public static int solution(int[] arr) {
		int count = 0;
		int index = 2;
		while (true) {
			if (index > 1000)
				break;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 1)
					continue;
				if (arr[i] % index == 0 && arr[i] != index) {
					arr[i] = 1;
				}
			}
			index++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1) {
				count++;
			}
		}

		return count;
	}
}
