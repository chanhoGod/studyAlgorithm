package baekjoon.m08;


import java.util.Scanner;

public class c1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		for (int i = 0; i < T; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			arr[i] = solution(x, y);
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static int solution(int x, int y) {
		int nowSpeed = 1;
		int count = 0;
		int distance = y - x;
		if(distance < 3) {
			return distance;
		}
		while (true) {
			distance -= nowSpeed * 2;
			nowSpeed++;
			count += 2;
			if (distance <= nowSpeed) {
				count++;
				break;
			}
			if (distance <= nowSpeed * 2) {
				count += 2;
				break;
			}
		}

		return count;
	}
}
