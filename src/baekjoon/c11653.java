package baekjoon;

import java.util.Scanner;

public class c11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d = 2;
		while(true) {
			if(N % d == 0) {
				N /= d;
				System.out.println(d);
			}else {
				d++;
			}
			
			if(N < d) {
				break;
			}
		}
	}
}
