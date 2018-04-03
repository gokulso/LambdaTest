package in.lambdaTest.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionExerciseJava7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Christopher", "Dickens", 47), 
				new Person("Lewis", "Caroll", 42),
				new Person("Charlotte", "Carlyle", 51), 
				new Person("Scarlett", "Bronte", 33),
				new Person("Anne", "Arnold", 35)

		);

		// Step1 - Sort the list by last Name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLirstName().compareTo(p2.getLirstName());
			}
		});

		// Step2 - method that prints all elements in the list
		System.out.println(" Printing all persons");
		printAll(people);
		
		System.out.println(" -------------------------- ");

		// Step3 - method that prints all people that last name start with c
		System.out.println(" Printing all persons Lastname start with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getLirstName().startsWith("C");
			}

		});
		
		System.out.println(" -------------------------- ");
		
		System.out.println(" Printing all persons Firstname start with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getFirstName().startsWith("C");
			}

		});

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people){
			if(condition.test(p))
			System.out.println(p);
		}
		
		
	}

	private static void printAll(List<Person> people) {
		for(Person p : people){
			System.out.println(p);
		}
		
	}

}
