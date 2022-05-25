package javastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomateSort {

	@Test
	public static void main(String[] args) {
		
		// Count the number of starting with alphabet A in list
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	//@Test
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		//there is no life for intermediate operations if there is no terminal operations
		// terminal operation will execute only if internal operation (filter) returns true
		// we can create stream
		// how to use filter in Stream API
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		Long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
			return true;
			
		}).count();
		System.out.println(d);
		// print all the names of ArrayList
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		}
	
	//@Test
	public void streamMap() 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		
		
		// print names of which have last letter "a" with uppercase
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.forEach(s->System.out.println(s));	
		// print namess which have first letter as a with uppercase and sorted
		
		List<String> names1 = Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Ram");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		// concating two streams
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
	}
	@Test
	public void StreamCollect()
	{
		List<String> ls =Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		//
		List<Integer> numbers = Arrays.asList(3,2,2,7,5,1,9,7);
		// print unique number from this array
		// sort the array - 3rd index
		numbers.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> sort = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sort.get(2));
		
	}

}
