package in.lambdaTest.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class CollectionExerciseJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Christopher", "Dickens", 47), 
				new Person("Lewis", "Caroll", 42),
				new Person("Charlotte", "Carlyle", 51), 
				new Person("Scarlett", "Bronte", 33),
				new Person("Anne", "Arnold", 35)

		);

		// Step1: Sort the list by last Name

		Collections.sort(people, (p1, p2) -> p1.getLirstName().compareTo(p2.getLirstName()));

		// Step2: Method that prints all elements in the list
		System.out.println(" Printing all persons");
		printConditionally(people, p -> true);

		System.out.println(" -------------------------- ");

		// Step3 - method that prints all people that last name start with c
		System.out.println(" Printing all persons Lastname start with C");

		printConditionally(people, p -> p.getLirstName().startsWith("C"));

		System.out.println(" -------------------------- ");

		System.out.println(" Printing all persons Firstname start with C");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate	) {
		for(Person p : people){
			if(predicate.test(p))
			System.out.println(p);
		}
	}
}
