package baekjoon;

import java.util.Scanner;

public class c1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		sc.close();

		int idx = 0;
		
		if(B < C) {
			idx = A/(C-B) + 1;
		}
		else {
			idx = -1;
		}
		System.out.println(idx);
		
	}
}
