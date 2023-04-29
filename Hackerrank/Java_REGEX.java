package Hackerrank;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.util.Scanner;

	public class Java_REGEX {

	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
	}
	class MyRegex {
		String pattern ="^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
				"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
				"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
				"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
	    }
