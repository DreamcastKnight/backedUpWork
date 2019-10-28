package main;

public class Move {
	public String north(int[] person) {

		person[0] = person[0] + 1;
		return "";
	}
	public String south(int [] person) {
		
		person[0]=person[0]-1;
		return "";
	}
	public String west(int [] person) {
		
		person[1]=person[1]-1;
		return "";
	}
	public String east(int [] person) {
		
		person[1]=person[1]+1;
		return "";
	}
}