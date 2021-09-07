package baekjoon.m09;

import java.util.Scanner;

public class c1463 {
	
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		count = 0;
		solution(N);
		System.out.println(count);
	}
	
	public static int solution(int idx) {
		if(idx <= 1)
			return 0;
		if(idx % 3 == 0) {
			count++;
			solution(idx/3);
		}else if(idx % 2 == 0) {
			count++;
			solution(idx/2);
		}else {
			count++;
			solution(idx-1);
		}
		
		
		return 0;
	}
}
