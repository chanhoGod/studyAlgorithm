package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx = sc.nextInt();
		List<String> arr = new ArrayList<String>();
		for(int i = 0; i < idx; i++) {
			arr.add(sc.next());
		}

		for(int i = 0; i < arr.size(); i++) {
			char tmp = 0;
			char[] ch = arr.get(i).toCharArray();
			for(int j = 0; j < ch.length - 1; j++) {
				if(ch[j] != ch[j + 1]) {
					tmp = ch[j];
				}
				if(arr.get(i).substring(j+1, ch.length).contains(String.valueOf(tmp))) {
					idx--;
					break;
				}
			}
		}
		
		System.out.println(idx);
		
	}
}
