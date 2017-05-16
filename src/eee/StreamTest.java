package eee;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class PersonSupplier implements Supplier<Person> {
	 private int index = 0;
	 
	private Random random = new Random();
	 @Override
	 public Person get() {
	 return new Person(index++, random.nextInt(100) ,"StormTestUser" + index );
	 }  
	}

class Person {
	 public int no;
	 private String name;
	 private int age;
	 public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 public Person (int no, int age, String name) {
	 this.no = no;
	 this.age = age;
	 this.name = name;
	 }
	 public String getName() {
	 return name;
	 }
	}


public class StreamTest {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<>();
		list.add("oa");
		list.add("bb");
		list.add("ccc");*/
		
		
		/*Stream<String> stream = list.stream();
		stream.filter(item -> item.length() > 1)
		.collect(Collectors.toList());*/
		
		/*Stream<String> stream = list.stream();
		String shortest = stream.min(Comparator.comparing(item->item.length())).get();
		System.out.println(shortest);*/

		/*String reduce2 = list.stream().reduce( (item,acc) -> acc+item ).get();
		System.out.println(reduce2);*/
		
	/*	String reduce = list.stream()
				.filter(item -> item.startsWith("o"))
				.reduce("", (acc,item) -> acc + " " + item );
		System.out.println(reduce);	*/
		
		/*Stream<List<Integer>> inputStream = Stream.of(
				 Arrays.asList(1),
				 Arrays.asList(2, 3),
				 Arrays.asList(4, 5, 6)
				 );
		
		Stream<Integer> outputStream = inputStream.
		flatMap((childList) -> childList.stream());	
		
	    //outputStream.collect(Collectors.toList()).forEach(System.out::print);;
		 	*/		
		
		/*List<String> ls = Stream.of("one", "two", "three", "four")
				 .filter(e -> e.length() > 3)
				 .peek(e -> System.out.println("Filtered value: " + e))
				 .map(String::toUpperCase)
				 .peek(e -> System.out.println("Mapped value: " + e))
				 .collect(Collectors.toList());*/
		
		/*String passage = "a\naa\naaa\nbb\n";
		List<String> lines = new ArrayList<>();
		for(String s:passage.split("\n")){
			lines.add(s);
		}
		
		String longest = lines.stream().max(Comparator.comparing(item -> item.length())).get();
		List<String> sortedString = 
				lines.stream()
				.sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		
		sortedString.stream().forEach(System.out::println);*/
		
		/*Stream.generate(new PersonSupplier())
			.limit(1000)
			.forEach(p -> System.out.println(p.getName()))
			;*/


		Map<Boolean, List<Person>> children = Stream.generate(new PersonSupplier()).
				 limit(100).
				 collect(Collectors.partitioningBy(p -> p.getAge() < 18));
				System.out.println("Children number: " + children.get(true).size());
				System.out.println("Adult number: " + children.get(false).size());
		
		
		
	}
}
