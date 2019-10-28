package main;

public class NumberApp {

	public static void main(String[] args) {
		String multChar(String input) {
			String multy="";
			input="The";
			for(int i=0; i<input.length()-1;i++) {
				multy= multy + input.substring(i) +input.substring(i);
			}
			
			System.out.println(multy);
		}
}
}