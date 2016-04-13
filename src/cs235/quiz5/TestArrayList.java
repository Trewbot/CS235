package cs235.quiz5;
import java.util.*;
public class TestArrayList {
	public static List<String> switchPairs(List<String> words){
		for(int i = 0; i < words.size() - 1; i += 2) words.set(i, words.set(i + 1, words.get(i)));
		return words;
	}
	public static void main(String[] args){
		List<String>	even = Arrays.asList("four","score","and","seven","years","ago"),
						odd = Arrays.asList("to","be","or","not","to","be","hamlet");
		System.out.println("BEFORE:\n" + even + "\n" + odd + "\n\nAFTER:\n" + switchPairs(even) + "\n" + switchPairs(odd));
	}
}
