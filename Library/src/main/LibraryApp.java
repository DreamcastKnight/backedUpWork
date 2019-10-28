package main;

public class LibraryApp {

	public static void main(String[] args) {

		String str = "hello";
		String newstr = "";
		for (int i = 0; i < str.length(); i++) {
			newstr=newstr+ str.charAt(str.length()-i);
		}
		System.out.println(newstr);
	}
}