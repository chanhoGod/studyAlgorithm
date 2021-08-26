package baekjoon.m08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(w - x);
		list.add(h - y);
		list.add(x);
		list.add(y);
		
		System.out.println(list.stream().min(Integer::compare).get());
	}
}
