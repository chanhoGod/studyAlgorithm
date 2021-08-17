package baekjoon;

import java.util.Scanner;

public class c2798 {
	//아직 못품
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = {};
		int tmp = 0;
		int min = 1000000;
		int max = 0;
		int result = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					tmp = arr[i] + arr[j] + arr[k];
					
					if(M - tmp >= max && tmp - M < min) {
						min = tmp - M;
						result = tmp;
					}
				}	
			}
			
		}
		
	}
}
