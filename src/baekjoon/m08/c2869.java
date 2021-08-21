package baekjoon.m08;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class c2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		System.out.println((int)solution(A, B, V));

	}

	public static double solution(int A, int B, int V) {
		double n = (double)(V-A)/(A-B);
		return Math.ceil(n) + 1;
	}

}
