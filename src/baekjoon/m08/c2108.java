package baekjoon.m08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class c2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(average(list));
		System.out.println(central(list));
		System.out.println(many(list));
		System.out.println(coverage(list));

	}

	public static int average(List<Integer> list) {
		int average = 0;
		for (int i = 0; i < list.size(); i++) {
			average += list.get(i);
		}

		return (int) Math.round((double) average / list.size());
	}

	public static int central(List<Integer> list) {
		if (list.size() <= 1) {
			return list.get(0);
		}
		Collections.sort(list);
		int center = list.get(list.size() / 2);
		return center;
	}

	public static int many(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			if (map.containsKey(list.get(i))) {
				int count = map.get(list.get(i));
				map.put(list.get(i), ++count);
			} else {
				map.put(list.get(i), 1);
			}
		}
		int num = 0;

		for (Integer i : map.keySet()) {
			if (map.get(i) > num) {
				num = map.get(i);
			}
		}
		List<Integer> tmplist = new ArrayList<Integer>();
		for (Integer i : map.keySet()) {
			if (map.get(i) == num) {
				tmplist.add(i);
			}
		}
		Collections.sort(tmplist);
		if (tmplist.size() > 1) {
			return tmplist.get(1);
		} else {
			return tmplist.get(0);
		}
	}

	public static int coverage(List<Integer> list) {
		int max = -4000;
		int min = 4000;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}

			if (list.get(i) > max) {
				max = list.get(i);
			}
		}

		return Math.abs(max - min);
	}
}
