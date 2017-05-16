package examples;

import java.util.*;

public class IOExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			String str = scanner.nextLine();
			if( str.equals("exit")){
				System.out.println("Bye");
				break;
			}
			System.out.println(str);
			
		}

	}

}
