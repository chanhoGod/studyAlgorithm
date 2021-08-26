package baekjoon.m08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			char[] arr = String.valueOf(i).toCharArray();
			int tmp = 0;

			for (int j = 0; j < arr.length; j++) {
				tmp += Integer.parseInt(String.valueOf(arr[j]));
			}
			if (tmp + i == N) {
				list.add(i);
			}
		}
		try {
			if (list.stream().min(Integer::compare).get() != null)
				System.out.println(list.stream().min(Integer::compare).get());
		} catch (Exception e) {
			System.out.println(0);
		}
	}
}
