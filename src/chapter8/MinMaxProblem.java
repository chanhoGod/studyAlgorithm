package chapter8;
/*
 * 나열된 수에서 최솟값과 최댓값 구하기
 * 
 * 여러개의 수가 배열에 있을 때 그 중 가장 큰 값과 가장 작은 값을 찾는다.
 * 배열의 몇번째에 있는지 순서를 찾는다.
 * 반복문을 한번만 사용하여 문제를 해결한다.
 * 수의 예 : [10, 55, 23, 2, 79, 101, 16, 82, 30, 45]
 * 
 * 배열에 있는 수중 맨 처음에 있는 값을 max와 min으로 가정하고, 배열의 마지막
 * 숫자까지 비교하면서 더 큰 수가 나올때 max와 min의 값을 바꾸도록 한다.
 * 
 * */
public class MinMaxProblem {
	public static void main(String[] args) {
		int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		int max = arr[0];
		int min = arr[0];
		int maxpos = 0;
		int minpos = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxpos = i+1;
			}
			if(arr[i] < min) {
				min = arr[i];
				minpos = i+1;
			}
		}
		
		System.out.println("최솟값은" + min+ " 위치는" + minpos+ " 입니다.");
		System.out.println("최댓값은" + max+ " 위치는" + maxpos+ " 입니다.");
	}	
	
}
