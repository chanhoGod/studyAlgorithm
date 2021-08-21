package baekjoon.m08;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class c10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String arr[] = new String[T];
		for (int i = 0; i < T; i++) {
			arr[i] = br.readLine();
		}
		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(arr[i]);
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			System.out.println(solution(H, W, N));
		}
	}

	public static int solution(int h, int w, int n) {
		String result = "";
		int idx = 0;

		for (int i = 1; i <= w; i++) {
			for (int j = 1; j <= h; j++) {
				idx++;
				if (idx == n) {
					if (i < 10) {
						result = j + "0" + i;
					} else
						result = j + "" + i;
					return Integer.parseInt(result);
				}
			}
		}

		return 0;
	}
}
