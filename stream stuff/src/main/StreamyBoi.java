package main;

import java.util.Arrays;
import java.util.List;

public class StreamyBoi {
	/*
	 * public static void main(String[] args) { List<Integer> list =
	 * Arrays.asList(10, 2, 3, 4, 5, 6, 7, 8); int max = 1; for (Integer i : list) {
	 * max = Math.max(max, i); } // System.out.println(max); int a =
	 * list.stream().reduce((acc, next) -> Math.max(acc, next)).get();
	 * System.out.println(a); }
	 */

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 2, 3, 4, 5, 6, 7, 8);
		int min = 1000000;
		for (Integer i : list) {
			min = Math.min(min, i);
		}
		System.out.println(min);
		list.stream().reduce((acc, next) -> Math.max(acc, next)).get();
		System.out.println(i);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

	}
}