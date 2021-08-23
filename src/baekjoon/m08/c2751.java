package baekjoon.m08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class c2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Integer[] arr = new Integer[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		Collections.sort(Arrays.asList(arr));
		
		for(int i : arr) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
		
	}
}
