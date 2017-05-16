package eee;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

interface MyAnyException{
	void throwException(String message, Exception e); 
}

class SonIOException implements MyAnyException{
	Exception myexception;
	public Exception getMyexception() {
		return myexception;
	}
	public SonIOException(Exception e){
		this.myexception = e;
	} 
	@Override
	public void throwException(String message, Exception e) {
		System.out.println(message+" "+e);
	}
}

public class ExceptionTest {
	
	private InputStream input;


	public void throwTwice(){
		input = null;
		try{
			input = new FileInputStream("myFile.txt");
		}catch(IOException e){
			throw new IOException();
		}finally{
			throw new ArithmeticException();
		}
		
		
		/*try{
			throw new ArithmeticException();
		}catch(ArithmeticException e2){
			e2.printStackTrace();
		}finally{
			System.out.println("e2");
		}*/
	}
	
	public double divide(double a, double b) throws IOException{
		  
		throw new ArithmeticException();
	}
	
	public void callDivide(double a, double b) throws IOException{  
		
		//divide(a,b);
		/*try {
			divide(a,b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("--- Divide End ---");
		}*/
	}
	
	 public void openFile() throws IOException{
	        FileReader reader = null;
	        try {
	            reader = new FileReader("someFile");
	            int i=0;
	            while(i != -1){
	                i = reader.read();
	                System.out.println((char) i );
	            }
	        } /*catch (IOException e) {
	            //do something clever with the exception
	        }*/ finally {
	            if(reader != null){
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    //do something clever with the exception
	                }
	            }
	            System.out.println("--- File End ---");
	        }
	    }
	 
	 private static void printFile() throws IOException {
		    InputStream input = null;

		    try {
		        input = new FileInputStream("file.txt");

		        int data = input.read();
		        while(data != -1){
		            System.out.print((char) data);
		            data = input.read();
		        }
		    } finally {
		        if(input != null){
		            input.close();
		        }
		    }
		}
	 
	 private static void printFileJava7() throws IOException {

		    try(FileInputStream input = new FileInputStream("file.txt")) {

		        int data = input.read();
		        while(data != -1){
		            System.out.print((char) data);
		            data = input.read();
		        }
		    }
		}
	
	 
	public static void main(String[] args) throws IOException,ArithmeticException {
		/*try {
			new ExceptionTest().openFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//new ExceptionTest().callDivide(0, 0);
		//System.out.println("eee");
		
		/*try {
			printFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//new ExceptionTest().callDivide(1, 0);
		//SonIOException testException = new SonIOException(new SQLException());
		//testException.throwException("IO",  testException.getMyexception());
		
		new ExceptionTest().throwTwice();
	}

}
