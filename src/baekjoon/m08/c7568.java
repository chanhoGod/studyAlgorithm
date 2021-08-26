package baekjoon.m08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Person p;
		List<Person> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			p = new Person(sc.nextInt(), sc.nextInt());
			list.add(p);
		}
		int[] rank = new int[list.size()];
		for(int i = 0; i < rank.length; i++)
			rank[i] = 1;
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getHeight() > list.get(j).getHeight()
						&& list.get(i).getWeight() > list.get(j).getWeight()) {
					rank[j]++;
				}else if(list.get(i).getHeight() < list.get(j).getHeight()
						&& list.get(i).getWeight() < list.get(j).getWeight()) {
					rank[i]++;
				}
			}
		}
		
		for(int i : rank) {
			System.out.println(i);
		}

	}

	public static class Person {
		private int weight;
		private int height;

		public Person(int weight, int height) {
			this.weight = weight;
			this.height = height;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

	}
}
