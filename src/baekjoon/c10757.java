package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class c10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		String A = st.nextToken();
		String B = st.nextToken();
		BigInteger abi = new BigInteger(A);
		BigInteger bbi = new BigInteger(B);
		
		System.out.println(abi.add(bbi));
	}
	

}
