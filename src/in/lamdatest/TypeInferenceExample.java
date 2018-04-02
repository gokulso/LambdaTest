package in.lamdatest;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLenght myLambda = s -> s.length();
	    System.out.println(myLambda.getLenght("Hello Lambda"));

	}
	
	
	interface StringLenght{
		int getLenght(String s);
	}

}

