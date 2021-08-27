package baekjoon.m08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class c1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		Set<String> set = new HashSet<>();
		for(int i = 0; i < N; i++) {
			set.add(sc.nextLine());
		}
		
		List<String> list = new ArrayList<>(set);
		list.stream().sorted(Comparator.comparing(String::length).thenComparing(String::compareTo)).forEach(s -> System.out.println(s));
	}
}
