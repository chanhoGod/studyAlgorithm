package baekjoon.m08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class c1003 {
	static int[] setting;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < T; i++) {
			setting = new int[41];
			int N = Integer.parseInt(br.readLine());
			fibonacci(N);
			if(N == 0) {
				list.add("1 0");
			}
			else if(N == 1) {
				list.add("0 1");
			}else if(N == 2) {
				list.add("1 1");				
			}
			else 
				list.add(String.valueOf(setting[N - 1]) +" "+ String.valueOf(setting[N]));
		}
		br.close();


		for(String s : list) {
			bw.write(s+"\n");
		}
		bw.flush();
		bw.close();

	}

	public static int fibonacci(int N) {
		if (N == 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		} else{
			if(setting[N]!= 0) {
				return setting[N];
			}
			else {
				setting[N] = fibonacci(N - 1) + fibonacci(N - 2);
				return setting[N];
			}
		}
	}
}
