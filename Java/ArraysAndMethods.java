package Java;

public class ArraysAndMethods {
	public static void main(String[] args) {

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6

		int[] randos = new int[6];

		randos[0] = 1;
		randos[1] = 5;
		randos[2] = 2;
		randos[3] = 8;
		randos[4] = 13;
		randos[5] = 6;

		// 2. Print out the first element in the array

		System.out.println(randos[0]);


		// 3. Print out the last element in the array without using the number 5

		System.out.println(randos[randos.length - 1]);

		// 4. Print out the element in the array at position 6, what happens?

		///System.out.println(randos[6]);
		///Index 6 out of bounds for length 6

		// 5. Print out the element in the array at position -1, what happens?

		///System.out.println(randos[-1]);
		/// Same thing as problem 4, Index out of bounds

		// 6. Write a traditional for loop that prints out each element in the array

		System.out.println("Traditional array for loop");

		for (int i = 0; i <= randos.length - 1; i++) {
			System.out.println(randos[i]);
		}

		// 7. Write an enhanced for loop that prints out each element in the array

		System.out.println("Enhanced array for loop");

		for (int number: randos) {
			System.out.println(number);
		}

		// 8. Create a new variable called sum, write a loop that adds
		//			each element in the array to the sum

		int sum = 0;

		for (int number: randos) {
			sum += number;
			System.out.println("Sum: " + sum);
		}

		System.out.println(sum);

		// 9. Create a new variable called average and assign the average value of the array to it

		int average = sum / randos.length;

		System.out.println(average);

		// 10. Write an enhanced for loop that prints out each number in the array
		//			only if the number is odd

		System.out.println("Printing only odds");

		for (int number : randos) {
			if (number % 2 != 0) {
				System.out.println(number);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String[] firstNames = new String[4];

		firstNames[0] = "Sam";
		firstNames[1] = "Sally";
		firstNames[2] = "Thomas";
		firstNames[3] = "Robert";

		for (String name : firstNames) {
			System.out.println(name);
		}

		// 12. Calculate the sum of all the letters in the new array

		int letters = 0;

		for (String name : firstNames) {
			letters += name.length();
			System.out.println("Name length: " + name.length());
			System.out.println("letters: " + letters);
		}

		System.out.println(letters);

		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a greeting.
		//			This method returns nothing.

		String name = "Devin";
		createGreeting(name);

		/// No need to sysout/print the greeting or set it equal to a variable, just call the method


		// 14. Write and test a method that takes a String name and
		//			returns a greeting.  Do not print in the method.

		// String greetMe = greeting(name);
		System.out.println(greeting(name));

		// Compare method 13 and method 14:
		//		a. Analyze the difference between these two methods.
		//		b. What do you find?
		//		c. How are they different?

		//// 	In order to see the results of both methods, a sysout statement is neccessary, where that print statement goes depends on if it's a void method
		////	or any other method

		// 15. Write and test a method that takes a String and an int and
		//			returns true if the number of letters in the string is greater than the int

		String word = "word";
		int num = 3;

		System.out.println(isGreaterThan(word, num));

		// 16. Write and test a method that takes an array of strings and a string and
		//			returns true if the string passed in exists in the array

		String[] stringyboys = new String[3];

		stringyboys[0] = "Riley";
		stringyboys[1] = "Avery";
		stringyboys[2] = "Dakota";

		String tester = "Joey";

		System.out.println(isItThere(stringyboys, tester));

		// 17. Write and test a method that takes an array of int and
		//			returns the smallest number in the array

		


		// 18. Write and test a method that takes an array of double and
		//			returns the average


		// 19. Write and test a method that takes an array of Strings and
		//			returns an array of int where each element
		//			matches the length of the string at that position


		// 20. Write and test a method that takes an array of strings and
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.


		// 21. Write and test a method that takes a string and
		//			returns true if the string is a palindrome



	}



	// Method 13:

	public static void createGreeting(String String1) {
		System.out.println("Welcome " + String1);
	}

	// Method 14:

	public static String greeting(String x) {
		return "Greetings Mrs. " + x + " Hunter!";
	}

	// Method 15:

	public static boolean isGreaterThan(String x, int y) {
		// if (x.length() > y) {
		// 	return true;
		// }

		return (x.length() > y);
	}


	// Method 16:

	public static boolean isItThere(String[] x, String name) {
		for (String n: x) {
			if (n.equals(name)) {
				return true;
			}
		}

		return false;
	}

	// Method 17:


	// Method 18:


	// Method 19:


	// Method 20:


	// Method 21:
}
