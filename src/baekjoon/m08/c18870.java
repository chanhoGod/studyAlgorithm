package baekjoon.m08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c18870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
				
		List<Integer> list = new ArrayList<>();
		String[] str = br.readLine().split(" ");
		br.close();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(str[i]));
		}
		
		List<Integer> newlist = new ArrayList<>(list);
		Collections.sort(newlist);
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for(int i = 0; i < newlist.size(); i++) {
			if(!map.containsKey(newlist.get(i))) {
				map.put(newlist.get(i), idx++);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i : list) {
			sb.append(map.get(i)).append(' ');
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}
}
