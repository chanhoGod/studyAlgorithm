package baekjoon.m08;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		sc.close();
		
		char[][] dial = { { 'A', 'B', 'C' },
				{ 'D', 'E', 'F' }, 
				{ 'G', 'H', 'I' }, 
				{ 'J', 'K', 'L' }, 
				{ 'M', 'N', 'O' },
				{ 'P', 'Q', 'R', 'S' }, 
				{ 'T', 'U', 'V' }, 
				{ 'W', 'X', 'Y', 'Z' } };
		int sum = 0;
		char[] arr = s1.toCharArray();
		List<String> list = Arrays.asList(s1.split(""));
		
		for(int k = 0; k < list.size(); k++) {
			for(int i = 0; i < dial.length; i++) {
				for(int j = 0; j < dial[i].length; j++) {
					if(list.get(k).charAt(0) == dial[i][j]) {
						sum += i+3;
					}
				}
			}
		}
		System.out.println(sum);
		
	}
}
