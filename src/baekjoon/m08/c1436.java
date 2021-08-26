package baekjoon.m08;

import java.util.Scanner;

public class c1436 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
 
		int six = 666;
		int count = 1;
        
		while(count != N) {
			six++;
			if(String.valueOf(six).contains("666")) {
				count++;
			}
		}
		System.out.println(six);
	}
}
