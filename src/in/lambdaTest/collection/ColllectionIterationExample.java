package in.lambdaTest.collection;

import java.util.Arrays;
import java.util.List;

public class ColllectionIterationExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(

				new Person("Christopher", "Dickens", 47), 
				new Person("Lewis", "Caroll", 42),
				new Person("Charlotte", "Carlyle", 51), 
				new Person("Scarlett", "Bronte", 33),
				new Person("Anne", "Arnold", 35)

		);
		
		System.out.println(" Using For loop");
		
		for(int i=0; i< people.size(); i++){
			System.out.println(people.get(i));
		}
		
		System.out.println(" Using For each loop");
		
		for(Person p : people){
			System.out.println(p);
		}
		
		System.out.println(" Using lambda forEach method");
		
		people.forEach(p->System.out.println(p));

	}

}
