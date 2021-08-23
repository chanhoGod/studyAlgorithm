package baekjoon.m08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		List<Integer> list = makePrime();
		
		for(int i = 0; i < T; i++) {
			solution(sc.nextInt(), list);
		}
		
	}
	public static class TmpClass {
		int x;
		int y;
		int sub;
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
		public int getSub() {
			return sub;
		}
		public void setSub(int sub) {
			this.sub = sub;
		}
	}
	
	
	public static void solution(int N, List<Integer> list) {
		TmpClass tmp = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > N) {
				break;
			}
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j) > N) {
					break;
				}
				
				if(list.get(i) + list.get(j) == N) {
					if(tmp == null) {
						tmp = new TmpClass();
						tmp.setX(list.get(i));
						tmp.setY(list.get(j));
						tmp.setSub(Math.abs(list.get(i) - list.get(j)));
					}else {
						if(tmp.getSub() > Math.abs(list.get(i) - list.get(j))) {
							tmp.setX(list.get(i));
							tmp.setY(list.get(j));
							tmp.setSub(Math.abs(list.get(i) - list.get(j)));
						}
					}
				}
			}
		}
		System.out.println(tmp.getX() + " " + tmp.getY());
	}
	
	public static List<Integer> makePrime() {
		int[] arr = new int[10000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i = 2; i < 100; i++) {
			for(int j = i * i - 1; j < arr.length; j+=i) {
				arr[j] = 1;
			}
		}
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			if(i != 1) {
				list.add(i);
			}
		}
		
		
		return list;
	}
}
