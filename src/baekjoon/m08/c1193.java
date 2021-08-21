package baekjoon.m08;


import java.util.Scanner;

public class c1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx = sc.nextInt();
		
		System.out.println(find(idx));
	}
	
	public static String find(int idx) {
		if(idx == 1) {
			return "1/1";
		}
		int mo;
		int ja;
		int num = 1;
		int tmp = 0;
		
		while(true) {
			tmp += num;
			if(idx <= tmp) break;
			
			num++;
		}
		if(num %2 == 0) {
			mo = num;
			ja = 1;
			tmp = tmp - num + 1;
			while(true) {
				if(tmp++ == idx) break;
				mo--;
				ja++;
			}
			
		}else {
			mo = 1;
			ja = num;
			tmp = tmp - num + 1;
			while(true) {
				if(tmp++ == idx) break;
				mo++;
				ja--;
			}
		}
		String str = String.valueOf(ja) + "/" + String.valueOf(mo);
		return str;
	}
}
