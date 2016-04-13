package cs235.prac10;
import java.io.*;
import java.util.*;
public class WordCount{
	public static void main(String[] a) throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader("test.txt"));
		Map<String,Integer> mapNameHere = new HashMap<String,Integer>();
		while(in.hasNext()){
			String word = in.next();
			if(!mapNameHere.containsKey(word)) mapNameHere.put(word, 1);
			else mapNameHere.put(word, mapNameHere.get(word) + 1);
		}
		in.close();
		System.out.println(mapNameHere);
	}
}
