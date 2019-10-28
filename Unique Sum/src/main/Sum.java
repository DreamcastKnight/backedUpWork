package main;

public class Sum {

	public static void main(String[] args) {
		String input = "hoopplla";
		int count=0;
		char[] a=input.toCharArray();
		for (int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				count++;
			}
		}
		System.out.println(count+1);
	}
}
