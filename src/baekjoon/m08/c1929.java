package baekjoon.m08;


import java.util.Scanner;

public class c1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		double num = Math.sqrt(N);
		int size = N - M + 1;
		int idx = 2;
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = M + i;
		}
		
		while(true) {
			for(int i = 0; i < size; i++) {
				if(arr[i] == 1)continue;
				if(arr[i]%idx == 0 && arr[i]!=idx) {
					arr[i] = 1;
				}
			}
			idx++;
			if(idx > num)
				break;
		}
		
		for(int i : arr) {
			if(i != 1) {
				System.out.println(i);
			}
		}
	}
}
