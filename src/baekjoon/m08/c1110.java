package baekjoon.m08;

import java.util.Scanner;

public class c1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		System.out.println(solution(N));
	}
	
	
	public static int solution(int N) {
		
		String str = String.valueOf(N);
		if(N == 0) {
			return 1;
		}
		int count = 0;
		while(true) {
			
			String[] st = str.split("");
			int back = 0;
			if(st.length < 2) {
				back = Integer.parseInt(st[0]);
			}else {
				back = Integer.parseInt(st[0]) + Integer.parseInt(st[1]);
			}
			String[] backSt = String.valueOf(back).split("");
			//1. 결과가 한자릿수
			if(backSt.length == 1) {
				str = st.length == 1?backSt[0] + st[0]:(st[1] + backSt[0]);
			}else {
				str = st.length == 1?backSt[1]:(st[1] + backSt[1]);
			}
			
			if(Integer.parseInt(str) == N) {
				count++;
				break;
			}
			
			count++;
		}
		
		
		return count;
	}
}
