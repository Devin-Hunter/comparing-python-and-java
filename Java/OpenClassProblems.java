

public class OpenClassProblems {

	public static void main(String[] args) {


		System.out.println(sumOfDigits(123252));

		String[] names = {"bob", "bay", "sam", "tiff", "molly"};

		System.out.println(names[1]);
	}

	static int sumOfDigits(int digits) {

	    // WRITE YOUR CODE HERE

		int sum = 0;
		System.out.println(digits);


	    while (digits >= 1) {
	    	int test = digits % 10;
	        sum = sum + test;
	        System.out.println(test);
	        digits = digits / 10;
	    }

	    return sum;


	}

	static void charArray(String userWord) {
	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

        // WRITE YOUR CODE HERE FOR

	    char[] c = new char[userWord.length()];

	    for (int i = 0; i <= userWord.length() - 1; i++) {
	    	c[i] = userWord.charAt(i);
	        System.out.println(c[i]);
	    }
	}

}
