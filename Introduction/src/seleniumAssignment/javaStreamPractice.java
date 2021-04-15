package seleniumAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;


public class javaStreamPractice {
	
	public static void main(String[] args)
	{
		ArrayList<String>  nameFriends =new ArrayList<String>();
		nameFriends.add("devang");
		nameFriends.add("Bala");
		nameFriends.add("Keshav");
		nameFriends.add("Harish");
		nameFriends.add("Anurup");
		
		Stream.of("Minal","Kalpak","Ankita","Chandan","Nilima").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("=========================");
		
		Stream.of("Minal","Kalpak","Nilima","Chandan","Ankita","Shilpa").filter(s->s.endsWith("a")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		
		System.out.println("=========================");

		List<String> namesFamily = Arrays.asList("Mayur","Gargi","Suman","Chitra","Chinu");
		
		Stream<String> newList = Stream.concat(nameFriends.stream(), namesFamily.stream());
		boolean flag= newList.anyMatch(s->s.equalsIgnoreCase("Gargi"));
//		boolean flag= newList.anyMatch(s->s.equalsIgnoreCase("Gaargi"));
		Assert.assertTrue(flag);	
		System.out.println(flag);
		System.out.println("=========================");
		List<String> ls= Stream.of("Nana","Ajja","Shah","Anupriya","Raghu","Biju","Arun").filter(s->s.startsWith("A")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println("===============distinct numbers==========");
		List<Integer> numbers = Arrays.asList(2,3,2,7,4,6,8,4);
		numbers.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("====Sorting=====================");
		numbers.stream().sorted().forEach(s->System.out.println(s));
		
	}
	/*public void StreamMap()
	{	
	}*/

}
