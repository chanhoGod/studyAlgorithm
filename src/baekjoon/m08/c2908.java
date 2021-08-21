package baekjoon.m08;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class c2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		br.close();
		
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for(char c : c1) {
			stack1.push(c);
		}
		for(char c : c2) {
			stack2.push(c);
		}
		StringBuilder n1 = new StringBuilder();
		for(int i = 0; i < s1.length(); i++) {
			n1.append(stack1.pop());
		}
		StringBuilder n2 = new StringBuilder();
		for(int i = 0; i < s2.length(); i++) {
			n2.append(stack2.pop());
		}
		if(Integer.parseInt(n1.toString()) > Integer.parseInt(n2.toString())) {
			System.out.println(Integer.parseInt(n1.toString()));
		}else {
			System.out.println(Integer.parseInt(n2.toString()));
		}

	}
}
