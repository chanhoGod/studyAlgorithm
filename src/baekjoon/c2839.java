package baekjoon;

import java.util.Scanner;

public class c2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		sc.close();

		System.out.println(solution(idx));
	}

	public static int solution(int idx) {

		if (idx == 4 || idx == 7) {
			return -1;
		} else if (idx % 5 == 1 || idx % 5 == 3) {
			return idx / 5 + 1;
		} else if (idx % 5 == 2 || idx % 5 == 4) {
			return idx / 5 + 2;
		} else if (idx % 5 == 0) {
			return idx / 5;
		}
		
		return idx;

	}
}
