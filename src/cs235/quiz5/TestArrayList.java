package cs235.quiz5;
import java.util.*;
public class TestArrayList {
	
	/*
	 * The method switches the order of values in an list of String in a pair.
	 * For even number elements, switch all the values in pair.
	 * For odd number elements, switch the values in pair until the last. Do not move the last one.
	 */
	public static void switchPairs(List<String> words){
		for(int i = 0; i < words.size() - 1; i += 2){
			String	temp1 = words.get(i),
					temps2 = words.get(i + 1);
			words.set(i + 1, temp1);
			words.set(i, temps2);
		}
	}
	public static void main(String[] args){
		//TODO
		/*
		 * Create a list of String using ArrayList with even number
		 * of elements. Call the method switchPairs to switch its 
		 * elements in pair, then print the list after switch
		 */
		List<String> even = new ArrayList<>(Arrays.asList("four","score","and","seven","years","ago"));
		System.out.println(even);
		switchPairs(even);
		System.out.println(even);
		
		/*
		 * Create a list of String using ArrayList with even number
		 * of elements. Call the method switchPairs to switch its 
		 * elements in pair, then print the list after switch
		 */	
		List<String> odd = new ArrayList<>(Arrays.asList("to","be","or","not","to","be","hamlet"));
		System.out.println(odd);
		switchPairs(odd);
		System.out.println(odd);
	}
}
