package eee;
import java.util.*;
import java.io.*;


public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input = in.next().toUpperCase();
		
		Size size = Enum.valueOf(Size.class, input);
		System.out.println(size.getAbbr()); 

	}
	
	enum Size{
		SMALL("s"), MEDIUM("m"), LARGE("l");
		private Size(String abbr){
			this.abbr = abbr;
		}
		public String getAbbr(){
			return abbr;
		}
		private String abbr;
	}

}
