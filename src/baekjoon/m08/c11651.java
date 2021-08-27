package baekjoon.m08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class c11651 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Point> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			String[] starr = str.split(" ");
			list.add(new Point(Integer.parseInt(starr[0]), Integer.parseInt(starr[1])));
		}
		list.stream().sorted(Comparator.comparing(Point::getY).thenComparing(Point::getX)).forEach(s -> System.out.println(s.getX() + " " +s.getY()));
		
	}
	
	public static class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	}
}
