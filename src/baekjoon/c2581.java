package baekjoon;

import java.util.Scanner;

public class c2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int size = M - N + 1;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = N + i;
		}
		solution(arr);

	}

	public static int solution(int[] arr) {
		int count = 0;
		int sum = 0;
		int min = 10000;
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
				sum += arr[i];
				if (min > arr[i])
					min = arr[i];
			}
		}
		if (count == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		return count;
	}
}
