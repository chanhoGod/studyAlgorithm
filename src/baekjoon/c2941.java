package baekjoon;

import java.util.Scanner;

public class c2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		char[] arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case 'c':
				if (i < arr.length - 1) {
					if (arr[i + 1] == '=') {
						count++;
						i++;
						break;
					}

					if (arr[i + 1] == '-') {
						count++;
						i++;
						break;
					}
				}
				count++;
				break;
			case 'd':
				if (i < arr.length - 2) {
					if (arr[i + 1] == 'z') {
						if (i + 2 < arr.length && arr[i + 2] == '=') {
							count++;
							i += 2;
							break;
						}
					}
				}
				if (i < arr.length - 1) {
					if (arr[i + 1] == '-') {
						count++;
						i++;
						break;
					}
				}
				count++;
				break;
			case 'l':
				if (i < arr.length - 1) {
					if (arr[i + 1] == 'j') {
						count++;
						i++;
						break;
					}
				}
				count++;
				break;
			case 'n':
				if (i < arr.length - 1) {
					if (arr[i + 1] == 'j') {
						count++;
						i++;
						break;
					}
				}
				count++;
				break;
			case 's':
				if (i < arr.length - 1) {
					if (arr[i + 1] == '=') {
						count++;
						i++;
						break;
					}
				}
				count++;
				break;
			case 'z':
				if (i < arr.length - 1) {
					if (arr[i + 1] == '=') {
						count++;
						i++;
						break;
					}
				}
				count++;
				break;
			default:
				count++;
				break;
			}
		}
		System.out.println(count);
	}
}
