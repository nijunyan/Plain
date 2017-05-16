package examples;

import java.util.*;

class Employee implements Comparable<Employee>{
	static int id = 1;
	private int EmployeeId;
	private String name;
	private double Salary;
	
	public Employee(){
		this.EmployeeId = id++;
	}
	public Employee(String name, double Salary){
		this();
		this.setName(name);
		this.setSalary(Salary);
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Employee.id = id;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
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
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return (int) (this.getSalary() - emp.getSalary());
	}
	public void print()
	{
		System.out.println(this.getName());
	}
	 
	
}

class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2){
	       return (int) (emp1.getSalary() - emp2.getSalary());
	    }
	
}

 

public class Sortings {

	public static void main(String[] args) {
		Employee emp1 = new Employee("a",1000);
		Employee emp2 = new Employee("b",2000);
		Employee emp3 = new Employee("c",1500);
		List<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		
		
		/*Collections.sort(emp);
		
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()){
			Employee e = (Employee) it.next();
			e.print();
		}*/
		
		
		/*MyComparator mc = new MyComparator();
		emp.sort(mc);
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()){
			Employee e = (Employee) it.next();
			e.print();
		}*/
		
		/*MyComparator mc = new MyComparator();
		Collections.sort(emp, mc);
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()){
			Employee e = (Employee) it.next();
			e.print();
		}*/
		
		/*Queue<Employee> q = new PriorityQueue<>();
		q.add(emp1);
		q.add(emp2);
		q.add(emp3);
		 
		while(!q.isEmpty()){
			System.out.println(q.poll().getName());
		}*/
		
		Comparator<Employee> mc =  
			(e1,e2) -> ( (int)(e1.getSalary() - e2.getSalary()))
				 ;
		Collections.sort(emp, mc);
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext()){
			Employee e = (Employee) it.next();
			e.print();
		}
		
	}

}
