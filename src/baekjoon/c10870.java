package baekjoon;

import java.util.Scanner;

public class c10870 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(pivonachi(num));

	}

	public static int pivonachi(int num) {
		
		if(num == 0)
			return 0;
		if (num == 1)
			return 1;
		
		System.out.println(num);
		
		return pivonachi(num - 2) + pivonachi(num - 1);

	}
}
