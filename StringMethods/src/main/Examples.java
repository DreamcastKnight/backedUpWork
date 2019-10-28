package main;

public class Examples {
	String eg="My name is Jack";
	
	 eg.startsWith("My"); -> true
	 eg.endsWith("Jack"); -> true
	 eg.charAt(8); -> 'i'
	
	String no = "\"blue\"";
	String esc = "yes//no";
	char[] array=eg.toCharArray();
	eg.substring(1); 
	//would give "y name is Jack"
	eg.substring(3,7);
	//would give "name "
	"name".equalsIgnoreCase("NAME");
	eg.toUpper(); //converts to all upper case
	eg.toLower(); //converts to all lower case
	String[] words =eg.split(" "); //will return an array with 'My' 'name' 'is' 'jack'
	eg.replaceAll(" ", ",");//replaces spaces with commas
	eg.indexOf("name");//will give 3
	eg.indexOf("Jack");//will give -1, as jack is not in the string
	String.valueOf();//convert stuff into strings
}