package chapter8;
/*
 * 정렬된 수에서 하나의 수의 위치 찾기
 * 
 * 여러개의 수가 정렬된 순서로 있을 때 특정한 수를 찾는 방법
 * 단순 반복문을 이용하면 수의 개수에 따라 비교횟수가 증가하는 O(n)의 수행이 이루어진다.
 * 수가 정렬된 상태에서는 이진탐색을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있따.
 * 
 * 수가 정렬된 상태이므로 중간의 값을 하나 선택하고 찾으려는 값이 그보다 크면 범위를 오른쪽으로
 * 그보다 작으면 왼쪽으로 범위를 좁힐 수 있다.
 * 한번 비교할 때마다 1/2씩 범위가 좁혀진다.
 * 
 * */


public class BinarySearchProblem {
	public static void main(String[] args) {
		int[] arr = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		
		int left = 0;						//왼쪽 끝
		int right = arr.length-1;			//오른쪽 끝
		int mid = (left + right)/2;			//중간 값
		
		int tmp = arr[mid];
		boolean find = false;
		
		while(left <= right) {
			if(target == tmp) {
				find = true;
				break;
			}else if(target < tmp) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
			mid = (left + right)/2;
			tmp = arr[mid];
		}
		if(find == true) {
			System.out.println(target +"은 " + ++mid +"번째 위치에 있습니다.");
		}else {
			System.out.println("찾는 수가 없습니다.");
		}
	}
}
