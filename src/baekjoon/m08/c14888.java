package baekjoon.m08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c14888 {
	static int[] intArr;
	static int[] opArr;
	static int opCount;
	static int sum;
	static List<Integer> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		intArr = new int[N];
		opArr = new int[4];
		for (int i = 0; i < N; i++) {
			intArr[i] = sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			opArr[i] = sc.nextInt();
			opCount += opArr[i];
		}
		list = new ArrayList<Integer>();
		solution(intArr[0], 0);
		System.out.println(list.stream().max(Integer::compare).get());		
		System.out.println(list.stream().min(Integer::compare).get());
	}

	public static void solution(int num, int depth) {
		if (depth == opCount) {
			list.add(num);
			return;
		}
		for (int i = 0; i < 4; i++) {
			if (opArr[i] != 0) {
				opArr[i]--;
				if(i == 0)
					solution(num + intArr[depth + 1], depth + 1);
				if(i == 1)
					solution(num - intArr[depth + 1], depth + 1);
				if(i == 2)
					solution(num * intArr[depth + 1], depth + 1);
				if(i == 3)
					solution(num / intArr[depth + 1], depth + 1);
				opArr[i]++;
			}
		}
		return;
	}

	
}
