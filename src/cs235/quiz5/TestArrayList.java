package cs235.quiz5;
import java.util.*;
public class TestArrayList {
	public static void switchPairs(List<String> words){
		for(int i = 0; i < words.size() - 1; i += 2) words.set(i, words.set(i + 1, words.get(i)));
	}
	public static void main(String[] args){
		List<String>	even = new ArrayList<>(Arrays.asList("four","score","and","seven","years","ago")),
						odd = new ArrayList<>(Arrays.asList("to","be","or","not","to","be","hamlet"));
		System.out.println("BEFORE:");
		System.out.println(even);
		System.out.println(odd);
		System.out.println("\nAFTER:");
		switchPairs(even);
		System.out.println(even);
		switchPairs(odd);
		System.out.println(odd);
	}
}
