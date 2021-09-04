package baekjoon.m09;

import java.util.ArrayList;
import java.util.List;

public class kakao {
	public static void main(String[] args) {
		
		int[][] v = {{1,1}, {2,2}, {1,2}};
		solution(v);
	}
	
	
	
	public static int[] solution(int[][] v) {
		int[] answer = new int[2];
		List<Integer> list = new ArrayList<Integer>();
		if(v[0][0] == v[1][0]) {
			v[0][0] = 0;
			v[1][0] = 0;
		}
		if(v[0][0] == v[2][0]) {
			v[0][0] = 0;
			v[2][0] = 0;
		}
		if(v[1][0] == v[2][0]) {
			v[1][0] = 0;
			v[2][0] = 0;
		}
		if(v[0][1] == v[1][1]) {
			v[0][1] = 0;
			v[1][1] = 0;
		}
		if(v[1][1] == v[2][1]) {
			v[1][1] = 0;
			v[2][1] = 0;
		}
		if(v[0][1] == v[2][1]) {
			v[0][1] = 0;
			v[2][1] = 0;
		}
		int x = 0;
		int y = 0;
		for(int i = 0; i < v.length; i++) {
			for(int j = 0; j < v[i].length; j++) {
				if(v[i][0] != 0) {
					x = v[i][0];
				}
				if(v[i][1] != 0) {
					y = v[i][1];
				}
			}
		}
		
		answer[0] = x;
		answer[1] = y;
		
		for(int i : answer) {
			System.out.println(i);
		}
		
		return answer;
	}
}
