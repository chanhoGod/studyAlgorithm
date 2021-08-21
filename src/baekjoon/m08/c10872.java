package baekjoon.m08;


import java.util.Scanner;

public class c10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = sc.nextInt();
		
		System.out.println("5 + 2 = " + 3 + 4);
		System.out.println("5 + 2 = " + (3 + 4));
		System.out.println(fac(idx));
	}
	
	
	public static int fac(int num) {
		if(num > 1) {
			num *= fac(num - 1);
		}
		if(num <= 0)
			return 1;
		
		return num;
	}
}
