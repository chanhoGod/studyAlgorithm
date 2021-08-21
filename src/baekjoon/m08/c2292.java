package baekjoon.m08;


import java.util.Scanner;

public class c2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx = sc.nextInt();
		
		System.out.println(beeHouse(idx));
	}
	
	public static int beeHouse(int idx) {
		
		if(idx == 1)
			return 1;
		
		int num = 1;	//초기값
		int div = 6; 	//등차
		int tmp = 1;
		
		while(true) {
			tmp += num * div;
			if(idx <= tmp)
				break;
			num++;
		}
		
		return num + 1;
	}

}
