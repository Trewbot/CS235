package cs235.lab4;
import java.util.*;
public class Driver{
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
    	int hours,minutes,seconds;
		String str;
		hours = getHours();
		minutes = getMinutes();
		seconds = getSeconds();
		str = getPeriod();
		System.out.println();
		System.out.print("24 hour clock time: ");
		print24HourTime(hours, minutes, seconds, str);
    }
    public static int getHours(){
    	int hours;
    	while(true){
    		try{
	    		System.out.print("Input hours: ");
	    		hours = console.nextInt();
	    		if(hours <= 12 && hours > 0) break;
	    		else throw new InvalidHrException();
    		}catch(InvalidHrException e){
    			System.out.println("Invalid hour input!");
    		}catch(InputMismatchException e){
    			console.next();
    			System.out.println("Input must be a number!");
    		}
    	}
    	return hours;
    }
    public static int getMinutes(){
    	int min;
    	while(true){
    		try{
	    		System.out.print("Input minutes: ");
	    		min = console.nextInt();
	    		if(min < 60 && min > 0) break;
	    		else throw new InvalidMinException();
    		}catch(InvalidMinException e){
    			System.out.println("Invalid minute input!");
    		}catch(InputMismatchException e){
    			console.next();
    			System.out.println("Input must be a number!");
    		}
    	}
    	return min;
    }
    public static int getSeconds(){
    	int sec;
    	while(true){
    		try{
	    		System.out.print("Input seconds: ");
	    		sec = console.nextInt();
	    		if(sec < 60 && sec > 0) break;
	    		else throw new InvalidSecException();
    		}catch(InvalidSecException e){
    			System.out.println("Invalid second input!");
    		}catch(InputMismatchException e){
    			console.next();
    			System.out.println("Input must be a number!");
    		}
    	}
    	return sec;
    }
    public static String getPeriod(){
    	String pd;
    	while(true){
    		try{
	    		System.out.print("Input period: ");
	    		pd = console.next();
	    		if(pd.equalsIgnoreCase("AM") || pd.equalsIgnoreCase("PM")) break;
	    		else throw new InvalidPdException();
    		}catch(InvalidPdException e){
    			System.out.println("Invalid period input!");
    		}
    	}
    	return pd;
    }
    public static void print24HourTime(int hours, int minutes, int seconds, String period){
    	System.out.println(
    		(period.equalsIgnoreCase("AM") ? (hours == 12 ? 0 : hours ) : hours + 12) + ":" + minutes + ":" + seconds
    	);
    }
}
