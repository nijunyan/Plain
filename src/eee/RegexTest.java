package eee;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		/*Pattern pattern = Pattern.compile("[A-Z]*");
		Matcher match = pattern.matcher("AXS123");
		boolean ifmatch = match.matches();
		System.out.println(ifmatch);
		
		/*int start = match.start();
		int end = match.end();
		System.out.println(start);
		System.out.println(end);*/
		
		/*
		boolean ifFound = match.lookingAt();
		System.out.println(ifFound);*/
		
		/*String input = "Here is a WikiWord followed by AnotherWikiWord, then SomeWikiWord.";
		Pattern pattern = Pattern.compile("[A-Z][a-z]*([A-Z][a-z]*)+");
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
		  Logger.getAnonymousLogger().info("Found this wiki word: " + matcher.group());
		}*/
		
		Pattern pattern = Pattern.compile("([0-9]{2})([a-z]*)");
		Matcher matcher = pattern.matcher("00aa11bb22cc");
		while (matcher.find())
		{
			System.out.println(matcher.group(0));
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
		}
		 
		
		
		
	}

}
