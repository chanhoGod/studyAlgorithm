package baekjoon.m08;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c1191 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		char[] c = new char[T];
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			char arr[][] = new char[n][n];
			for (int j = 0; j < n; j++) {
				arr[j] = br.readLine().toString().toCharArray();
			}

			c[i] = solution(arr, n - 1);
		
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		br.close();
		for(char ch : c) {
			System.out.println(ch);
		}
		
	}

	public static class Point {
		int x;
		int y;

		public void setX(int x) {
			this.x = x;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}

	public static char solution(char[][] arr, int n) {

		Point A = new Point();
		Point B = new Point();
		char result = 0;
		while (true) {
			int randomNum1 = (int) (Math.random() * 2);
			int randomNum2 = (int) (Math.random() * 2);
			
			boolean flag = true;
			if (randomNum1 == 0) {
				// 1. A이동 오아
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j] == 'A') {
							if (j + 1 < arr.length && arr[i][j + 1] != '#') {
								arr[i][j] = '.';
								arr[i][j + 1] = 'A';
								A.setX(i);
								A.setY(j+1);
								flag = false;
								break;
							} else if (i + 1 < arr.length && arr[i + 1][j] != '#') {
								arr[i][j] = '.';
								arr[i + 1][j] = 'A';
								A.setX(i+1);
								A.setY(j);
								flag = false;
								break;
							}
						}
					}
					if (arr[n][n] == 'A') {
						result = 'A';
						break;
					}
					if(flag == false)
						break;
				}
			} else if (randomNum1 == 1) {
				// 2. A이동 아오
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						if (arr[i][j] == 'A') {
							if (i + 1 < arr.length && arr[i + 1][j] != '#') {
								arr[i][j] = '.';
								arr[i + 1][j] = 'A';
								A.setX(i+1);
								A.setY(j);
								flag = false;
								break;
							} else if (j + 1 < arr.length && arr[i][j + 1] != '#') {
								arr[i][j] = '.';
								arr[i][j + 1] = 'A';
								A.setX(i);
								A.setY(j+1);
								flag = false;
								break;
							}
						}
					}
					if (arr[n][n] == 'A') {
						result = 'A';
						break;
					}
					if(flag == false)
						break;
				}

			}
			if (result != 0) {
				break;
			}
			flag = true;
			if (randomNum2 == 0) {
				// 3. B이동 왼위
				for (int i = arr.length - 1; i >= 0; i--) {
					for (int j = arr[i].length - 1; j >= 0; j--) {
						if (arr[i][j] == 'B') {
							if (j - 1 >= 0 && arr[i][j - 1] != '#') {
								arr[i][j] = '.';
								arr[i][j - 1] = 'B';
								B.setX(i);
								B.setY(j-1);
								flag = false;
								break;
							} else if (i - 1 >= 0 && arr[i - 1][j] != '#') {
								arr[i][j] = '.';
								arr[i - 1][j] = 'B';
								B.setX(i-1);
								B.setY(j);
								flag = false;
								break;
							}
						}
					}
					if (arr[0][0] == 'B') {
						result = 'B';
						break;
					}
					if(flag == false)
						break;
				}
			} else if (randomNum2 == 1) {

				// 4. B이동 위왼
				for (int i = arr.length - 1; i >= 0; i--) {
					for (int j = arr[i].length - 1; j >= 0; j--) {
						if (arr[i][j] == 'B') {
							if (i - 1 >= 0 && arr[i - 1][j] != '#') {
								arr[i][j] = '.';
								arr[i - 1][j] = 'B';
								B.setX(i-1);
								B.setY(j);
								flag = false;
								break;
							} else if (j - 1 >= 0 && arr[i][j - 1] != '#') {
								arr[i][j] = '.';
								arr[i][j - 1] = 'B';
								B.setX(i);
								B.setY(j-1);
								flag = false;
								break;
							}
						}

					}
					if (arr[0][0] == 'B') {
						result = 'B';
						break;
					}
					if(flag == false)
						break;
				}
			}
			flag = true;
			if (A.getX() == B.getX() && A.getY() == B.getY()) {
				if (randomNum2 == 0) {
					// 3. B이동 왼위
					for (int i = arr.length - 1; i >= 0; i--) {
						for (int j = arr[i].length - 1; j >= 0; j--) {
							if (arr[i][j] == 'B') {
								if (j - 1 >= 0 && arr[i][j - 1] != '#') {
									arr[i][j] = 'A';
									arr[i][j - 1] = 'B';
									B.setX(i);
									B.setY(j-1);
									flag = false;
									break;
								} else if (i - 1 >= 0 && arr[i - 1][j] != '#') {
									arr[i][j] = 'A';
									arr[i - 1][j] = 'B';
									B.setX(i-1);
									B.setY(j);
									flag = false;
									break;
								}
							}

						}
						if (arr[0][0] == 'B') {
							result = 'B';
							break;
						}
						if(flag == false)
							break;
					}
				} else if (randomNum2 == 1) {

					// 4. B이동 위왼
					for (int i = arr.length - 1; i > 0; i--) {
						for (int j = arr[i].length - 1; j > 0; j--) {
							if (arr[i][j] == 'B') {
								if (i - 1 >= 0 && arr[i - 1][j] != '#') {
									arr[i][j] = 'A';
									arr[i - 1][j] = 'B';
									B.setX(i-1);
									B.setY(j);
									flag = false;
									break;
								} else if (j - 1 >= 0 && arr[i][j - 1] != '#') {
									arr[i][j] = 'A';
									arr[i][j - 1] = 'B';
									B.setX(i);
									B.setY(j-1);
									flag = false;
									break;
								}
							}

							

						}
						if (arr[0][0] == 'B') {
							result = 'B';
							break;
						}
						if(flag == false)
							break;
					}
				}
			}
			if (result != 0) {
				break;
			}
		}
		return result;
	}

}
