package eee;
import java.util.*;

class Employee{
	private String name;
	private double Salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.Salary = salary;
	}
}

class HandleCompareEmployee<T>{
	public void test(String signal, Comparator<T> comp){
		
	}
	
}

public class LambdaTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
