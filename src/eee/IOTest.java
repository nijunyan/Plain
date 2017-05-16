package eee;

import java.io.*;
import java.util.*;

public class IOTest {

	public static void main(String[] args) throws IOException {

		/*
		 * byte[] bytes = null; String content = "String contents"; bytes =
		 * content.getBytes(); InputStream input = new
		 * ByteArrayInputStream(bytes);
		 * 
		 * ByteArrayOutputStream output = new ByteArrayOutputStream();
		 * 
		 * output.write("This text is converted to bytes".getBytes("UTF-8"));
		 * 
		 * byte[] resultbytes = output.toByteArray();
		 * 
		 * for(byte b:resultbytes){ System.out.println(b); }
		 */

		/*
		 * char[] chars = null; String content = "String contentsŒ“"; chars =
		 * content.toCharArray(); Reader input = new CharArrayReader(chars); int
		 * data = input.read(); while(data != -1){ System.out.print((char)data);
		 * data = input.read(); }
		 */

		/*
		 * byte[] bytes = new byte[1024]; String content = "Œ“Stringcontent";
		 * bytes = content.getBytes();
		 * 
		 * InputStream input = new ByteArrayInputStream(bytes); byte[] buffer =
		 * new byte[10];
		 * 
		 * int bytesSize = input.read(buffer); while(bytesSize!=-1) {
		 * System.out.println(bytesSize); System.out.println(new
		 * String(buffer)); for(int i = 0; i < buffer.length; i++){ buffer[i] =
		 * 0; } bytesSize = input.read(buffer); }
		 */

		/*
		 * try (Writer writer = new FileWriter("c:/writer.txt")) { String
		 * content = "Œ“eeeaaa"; writer.write(content); writer.flush(); //
		 * writer.close(); } try (Reader reader = new
		 * FileReader("c:/writer.txt")) { char[] buffer = new char[100];
		 * 
		 * int len = reader.read(buffer, 0, 3); while (len != -1) {
		 * System.out.println(buffer); for(int i=0; i < buffer.length; i++){
		 * buffer[i] = 0; } len = reader.read(buffer, 0, len); }
		 * 
		 * }
		 */
		/*
		 * RandomAccessFile input = new RandomAccessFile("c:/writer.txt", "rw");
		 * RandomAccessFile output = new RandomAccessFile("c:/reader.txt",
		 * "rw");
		 * 
		 * String content = null; int len = 0; len = input.read();
		 * 
		 * while (len != -1) { output.write(len); //System.out.println(len); len
		 * = input.read(); }
		 */

		/*
		 * File file = new File("c:/reader.txt");
		 * System.out.println(file.length());
		 */

		List<File> all = new ArrayList<>();
		listFile("g:/", all);
		for(File f: all){
			System.out.println(f);
		}
	}

	public static void listFile(String dir, List<File> all) {
		File filedir = new File(dir);
		File[] files = filedir.listFiles();
		if(files == null ) {
			System.out.println("\""+dir+"\""+" is empty!");
			return;
		}
		for (File f : files) {
			if (f.isFile()) {
				//System.out.println(f);
				all.add(f);
			} else if (f.isDirectory()) {
				listFile(f.toString(), all);
			}

			// System.out.println(f);
		}
	}

}
