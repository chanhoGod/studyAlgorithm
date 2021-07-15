package chapter8;

/*
 * 버블 정렬(Bubble Sort), 삽입 정렬(Insertion Sort), 선택 정렬(Selection Sort)
 * 전부 평균 수행시간이 O(n^2)인 알고리즘 
 * 각 요소가 다른 요소와 평균 한번 이상씩 비교를 하여 정렬이 된다.
 * 
 * 삽입 정렬은 두번째 순에서 시작해서 그 앞에 있는 숫자들과의 계속적인 비교로 정렬을 진행하는 방법이다. 
 * 첫번째 숫자는 정렬이 되어 있다고 가정하고 두번째 순서에서 시작해서 그앞인 첫번째와 비교 세번째는 앞의 두번째 첫번째와 비교하는 방식
 * 
 * 버블 정렬은 단순하게 앞과 뒤를 비교해서 정렬을 하는 방식이다. 몇번의 반복끝에 한 회분의 정렬의 마지막 숫자들은 정렬이 되어 있다는
 * 가정하에 다음 회분의 정렬에서 제외되고 나머지 숫자로 정렬을 반복한다.
 * 
 * 선택 정렬은 배열 중 최솟값을 찾은 다음 최솟값을 첫번째 원소와 바꾸면서 정렬을 진행하는 방법이다.
 * 
 * 
 * */

public class ON2Sort {

	public static void insertionSort(int[] arr) {

		int tmp = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;

				}
			}

		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
	
	public static void bubbleSort(int[] arr) {
		int tmp;
		int end = arr.length;
		
		for(int i = end - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void selectionSort(int[] arr) {
		int tmp;
		int min;
		int point = 0;
		
		for(int i = 0; i < arr.length; i++) {
			min = arr[i];
			for(int j = i; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					point = j;
				}
			}
			tmp = arr[i];
			arr[i] = min;
			arr[point] = tmp;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	

	public static void main(String[] args) {
		int[] arr = { 80, 50, 70, 10, 60, 20, 40, 30 };

		insertionSort(arr);
//		System.out.println();
//		bubbleSort(arr);
//		System.out.println();
//		selectionSort(arr);
	}
}
