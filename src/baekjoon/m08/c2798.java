package baekjoon.m08;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c2798 {
	//아직 못품
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		int min = M;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					if(arr[i] + arr[j] + arr[k] <= min) {
						list.add(arr[i] + arr[j] + arr[k]);
					}
				}
			}
		}
		
		int result = list.stream().max(Integer::compare).get();
		System.out.println(result);
	}
}
