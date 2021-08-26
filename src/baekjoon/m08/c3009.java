package baekjoon.m08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Point> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			list.add(new Point(sc.nextInt(), sc.nextInt()));
		}

		if(list.get(0).x == list.get(1).x) {
			list.get(0).x = 0;
			list.get(1).x = 0;
		}
		if(list.get(0).y == list.get(1).y) {
			list.get(0).y = 0;
			list.get(1).y = 0;
		}
		if(list.get(1).x == list.get(2).x) {
			list.get(1).x = 0;
			list.get(2).x = 0;
		}
		if(list.get(1).y == list.get(2).y) {
			list.get(1).y = 0;
			list.get(2).y = 0;
		}
		if(list.get(0).x == list.get(2).x) {
			list.get(0).x = 0;
			list.get(2).x = 0;
		}
		if(list.get(0).y == list.get(2).y) {
			list.get(0).y = 0;
			list.get(2).y = 0;
		}
		
		int result_x = 0;
		int result_y = 0;
		
		for(int i = 0; i < 3; i++) {
			if(list.get(i).x != 0) {
				result_x = list.get(i).x;
			}
			if(list.get(i).y != 0) {
				result_y = list.get(i).y;
			}
		}
		System.out.println(result_x +" " + result_y);
		
	}

	public static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}	
	}
}
