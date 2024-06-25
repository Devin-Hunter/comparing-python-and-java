

public class OpenClassProblems {

	public static void main(String[] args) {


		System.out.println(sumOfDigits(123252));

		String[] names = {"bob", "bay", "sam", "tiff", "molly"};

		System.out.println(names[1]);

        String[] donut = {"boop", "dog", "cat", "line", "wenis", "name", "radio"};

        newArray("hey", "yo", "boo", donut);
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

    public static void newArray(String word1, String word2, String word3, String[] arr) {

        // WRITE YOUR CODE HERE
        String[] newArr = {word1, word2, word3};

        String[] anotherArr = new String[arr.length + newArr.length];


        for (int i = 0; i <= arr.length - 1; i++) {
            anotherArr[i] = arr[i];
            // System.out.println(arr.length);
            // System.out.println(arr[i]);
            // System.out.println(anotherArr[i]);
        }

        int n = 0;

        for (int i = arr.length; i <= anotherArr.length - 1; i++) {
            anotherArr[i] = newArr[n];
            n++;
        }

        for (String s: anotherArr) {
            System.out.println(s);
        }

	}

}
