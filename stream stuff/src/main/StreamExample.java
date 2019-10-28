package main;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			nums.add(i);
		}
		nums.stream().map(x -> x * x)
		.filter(x -> x % 5 == 0)
		.reduce((a, b) -> a + b).get();
		System.out.println(nums);
	}
}
