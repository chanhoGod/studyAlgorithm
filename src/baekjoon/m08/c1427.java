package baekjoon.m08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class c1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		char[] arr = N.toCharArray();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			list.add(Integer.parseInt(String.valueOf(arr[i])));
		}
		
		Collections.sort(list, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		
		System.out.println(sb.toString());
	}
}
