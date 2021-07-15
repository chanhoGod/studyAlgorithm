package chapter8;
/*
 * 평균 수행시간이 O(logN)인 알고리즘
 * 퀵정렬(Quick Sort), 병합정렬(Merge Sort), 힙정렬(Heap Sort)
 * 한번 수행될때마다 정렬되어야 하는 수의 범위가 1/2로 줄어드는 경우
 * 퀵 정렬 이외의 다른 알고리즘은 추가적인 메모리가 필요하다.
 * 퀵 정렬은 최악의 경우 n^2의 복잡도가 나올 수 있음
 * 
 * 
 * */
class HeapSort{
	
	private int arrSize;
	private int[] heapArr;
	
	public HeapSort() {
		arrSize = 0;
		heapArr = new int[50];
	}
	
	public void insertHeap(int input) {
		int i = ++arrSize;
		
		while((i != 1)&& (input < heapArr[i/2])) {
			heapArr[i] = heapArr[i/2];
			i = i/2;
		}
		heapArr[i] = input;		
	}
	
	public void printHeap() {
		for(int i = 1; i <= arrSize; i++) {
			System.out.print(heapArr[i] + " ");
		}
	}
	
	public int deleteHeap() {
		int returnIdx, lastIdx;
		
		int parent, child;
		returnIdx = heapArr[1];						//반납값은 첫번째 원소여야만함
		lastIdx = heapArr[arrSize];					//마지막원소 이걸 받아서 위치를 조정
		arrSize -= 1;								//첫번째를 반납했으니 사이즈가 하나 빠짐
		
		parent = 1; child = 2;
		
		while(child <= arrSize) {					//자식 노드의 순서가 배열사이즈보다 작을때까지
			if((child < arrSize) && (heapArr[child] > heapArr[child+1])) {
				child++;							//왼쪽과 오른쪽 값중 더 작은 값을 선택하기 위해서 이렇게 만듬
			}										//왼쪽이 더 크면 child++을 해서 오른쪽 child선택
													//오른쪽이 더 크면 그대로 오른쪽 child를 가지고 감
			if(lastIdx <= heapArr[child]) break;
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;								//logn만큼 줄어드는 알고리즘이기 때문에 child를 2배씩 곱해줘서 간격을 줄여줌
		}
		
		heapArr[parent] = lastIdx;
		return returnIdx;
	}
	
}

public class OlogNSort {
	
	public static void main(String[] args) {
		
		HeapSort h = new HeapSort();
		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);
		h.insertHeap(30);

		h.printHeap();
		System.out.println();
		System.out.println(h.deleteHeap());
		h.printHeap();	
		System.out.println();
		System.out.println(h.deleteHeap());
		h.printHeap();	
		System.out.println();
		System.out.println(h.deleteHeap());
		h.printHeap();	
	}
}
