package baekjoon.m08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c15649 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < N*M; i++) {
//			sb.append(list.get(i));
			for(int j = i; j < M; j++) {
				sb.append(list.get(j));
			}
			System.out.println(sb);
		}
	}
}
