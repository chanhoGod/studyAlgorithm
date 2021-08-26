package baekjoon.m08;

import java.util.Scanner;

//터렛
public class c1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			double distance = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));

			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			} else if (Math.abs(r1 - r2) > distance) {
				System.out.println(0);
			} else if (r1 + r2 < distance) {
				System.out.println(0);
			} else if (r1 + r2 == distance) {
				System.out.println(1);
			} else if (Math.abs(r1 - r2) == distance) {
				System.out.println(1);
			} else if (r1 + r2 > distance) {
				System.out.println(2);
			}
		}
	}

}
