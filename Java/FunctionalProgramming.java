public class FunctionalProgramming {

	public static void main(String[] args) {

		printListTraditional(List.of(1, 2, 3, 4, 5, 7, 8, 9, 33, 10));
		
		printListFunctional(List.of(1, 2, 3, 4, 5, 7, 8, 9, 33, 10));
		
		printEvenNumbersFunctional(List.of(1, 2, 3, 4, 5, 7, 8, 9, 33, 10));
		
		printStringUsingFunctional(List.of("Java", "REST", "Azure", "Spring", "AWS", "Docker", "Spring Boot", "Spring MVC"));
		
		printSquareOfNumbersFunctional(List.of(1, 2, 3, 4, 5, 7, 8, 9, 33, 10));
	}

	private static void printSquareOfNumbersFunctional(List<Integer> numbers) {
		
		numbers.stream().map(number -> number * number).forEach(System.out::print);
	}

	private static void printStringUsingFunctional(List<String> list) {
		
		list.stream().forEach(System.out::print);
		System.out.println();
		
		list.stream().filter(string -> string.contains("Spring")).forEach(System.out::print);
		System.out.println();
		
		list.stream().filter(string -> string.length() >= 4).forEach(System.out::print);
		System.out.println();
	}

	private static void printEvenNumbersFunctional(List<Integer> numbers) {
		
		numbers.stream().filter(FunctionalProgramming::isEven).forEach(System.out::print);
		System.out.println();
		
		numbers.stream().filter(number -> number%2 == 0).forEach(System.out::print);
		System.out.println();
		
		numbers.stream().filter(number -> number%2 != 0).forEach(System.out::print);
		System.out.println();
	}

	private static void printListFunctional(List<Integer> numbers) {
		
		numbers.stream().forEach(FunctionalProgramming::print);
		System.out.println();
		
		numbers.stream().forEach(System.out::print);
		System.out.println();
	}

	private static void printListTraditional(List<Integer> numbers) {

		for (int number : numbers) {

			System.out.print(number);
		}
		
		System.out.println();
	}
	
	private static void print(int num) {
		
		System.out.print(num);
	}
	
	private static boolean isEven(int num) {
		return num%2 == 0;
	}
}
