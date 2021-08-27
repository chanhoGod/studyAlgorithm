package baekjoon.m08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class c10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Person> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(new Person(sc.nextInt(), sc.next()));
		}
		list.stream().sorted(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
			
		}).forEach(s -> System.out.println(s.getAge() +" "+ s.getName()));
	}

	public static class Person{
		private int age;
		private String name;

		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
