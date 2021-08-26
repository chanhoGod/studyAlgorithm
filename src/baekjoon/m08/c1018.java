package baekjoon.m08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class c1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] arr = new char[N][M];
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLine().toCharArray();
		}
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < N - 7; i++) {
			for(int j = 0; j < M - 7; j++) {
				list.add(find(i, j, arr));
			}
		}
		System.out.println(Collections.min(list));
	}
	
	
	
	public static int find(int height, int weight, char[][] arr) {
		char first = arr[height][weight];
		int end_h = height + 8;
		int end_w = weight + 8;
		int count = 0;
		
		for(int i = height; i < end_h; i++) {
			for(int j = weight; j < end_w; j++) {
				if(arr[i][j] != first) {
					count++;
				}
				
				if(first == 'W') {
					first = 'B';
				}else {
					first = 'W';
				}
			}
			if(first == 'W') {
				first = 'B';
			}else {
				first = 'W';
			}
		}
		char last = arr[height+7][weight+7];
		int backCount = 0;
		for(int i = height; i < end_h; i++) {
			for(int j = weight; j < end_w; j++) {
				if(arr[i][j] != last) {
					backCount++;
				}
				
				if(last == 'W') {
					last = 'B';
				}else {
					last = 'W';
				}
			}
			if(last == 'W') {
				last = 'B';
			}else {
				last = 'W';
			}
		}
				
		return count > backCount?backCount:count;
	}
}
