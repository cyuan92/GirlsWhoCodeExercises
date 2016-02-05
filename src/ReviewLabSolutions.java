import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class ReviewLabSolutions {

	/* Given the number of weeks, calculate the number of hours 
	 * in those weeks and return it. 
	 */
    public static int getHoursInWeeks(int weeks) {
       
        return weeks * 7 * 24;
    }

    
	/*
	 * Given a number, check and return whether the number is even.     
	 */
    public static boolean isEven(int number) {
    	
    	return number % 2 == 0;
    }
    
    
    /* Given the grade, return "pass" if the grade is more than
     * or equal to 50; otherwise, print "fail" if the grade is
     * less than 50.
     */
    public static String checkGrade(int grade) {
    	
    	return grade >= 50 ? "pass" : "fail";
    }
    
    
    /*
     * Given an ArrayList of numbers, return the sum of the numbers.
     */
    public static int getSum(ArrayList<Integer> numbers) {
    	int sum = 0;
    	
    	for (int n : numbers) {
    		sum += n;
    	}
    
    	return sum;
    }
    
    
    /*
     * Given an ArrayList of numbers, return the average of the numbers.
     * Do not recalculate the sum - use the previous getSum() function.
     */
    public static double getAverage(ArrayList<Integer> numbers) {
    	
    	return (double) getSum(numbers) / numbers.size();
    }
    
    
    /*
     * Given an ArrayList of words, return a sentence by appending
     * each word in the order that it appears separated with a blank space.
     * 
     * However, the sentence should not start with a space or end with a space.
     */
    public static String makeSentence(ArrayList<String> words) {
    	String sentence = "";
    	
    	for (String word : words) {
    		sentence += word + " ";
    	}
    	
    	return sentence.trim();
    }
    
    
    /* Create a HashMap for numbers 1-10 where the key 
     * is the number and the value is the text of the number.
     * Example:
     * 1 -> ONE
     * 2 -> TWO
     * ...
     * 
     * Return the HashMap once done.
     */
    public static HashMap<Integer, String> createNumberMap()
    {
    	HashMap<Integer, String> numberMap = new HashMap<Integer, String>();
        numberMap.put(1, "ONE");
        numberMap.put(2, "TWO");
        numberMap.put(3, "THREE");
        numberMap.put(4, "FOUR");
        numberMap.put(5, "FIVE");
        numberMap.put(6, "SIX");
        numberMap.put(7, "SEVEN");
        numberMap.put(8, "EIGHT");
        numberMap.put(9, "NINE");
        numberMap.put(10, "TEN");
        
    	return numberMap;
    }

    
    /*
     * Use the HashMap from the function above and for the given number,
     * return the text of the number. If the number is not in the HashMap,
     * return the text "not found".
     */
    public static String getNumberText(int number)
    {
    	HashMap<Integer, String> numberMap = createNumberMap();
    	String result = "not found";
    	if (numberMap.containsKey(number)) {
    		result = numberMap.get(number);
    	}
        
    	return result;
    }

    
    /*
     * Fibonacci Loop
     * Calculate the Fibonacci number given n. Fibonacci number is
     * calculated with the following function:
     * 
     * F(n) = F(n-1) + F(n-2)
     * F(1) = F(2) = 1
     * 
     * Use a "while" loop.
     * 
     * Challenge: Try using a recursive function.
     */
    public static int getFibonacciNumber(int n) {
    	if (n == 1 || n == 2) {
    		return 1;
    	}
    	
    	return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
    }
     
    
    /*
     * Given a LinkedList of numbers, return a new HashSet
     * of all numbers that have duplicates. 
     */
    public static HashSet<Integer> getDuplicates(LinkedList<Integer> numbers) {
    	HashSet<Integer> duplicates = new HashSet<Integer>();
    	HashSet<Integer> seen = new HashSet<Integer>();
    	
    	for (int num : numbers) {
    		if (!duplicates.contains(num) && seen.contains(num)) {
    			duplicates.add(num);
    		}
    		
    		seen.add(num);
    	}
    	
    	return duplicates;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    public static void main( String[] args ) throws Exception
    {
    	// hoursInWeeks test
    	{
        	int hoursInOneWeek = 1 * 7 * 24;
        	int hoursInFourWeeks = 4 * 7 * 24;
        	int hoursInZeroWeeks = 0;
        	
        	System.out.println("----------------------");
        	
        	if (getHoursInWeeks(1) == hoursInOneWeek) {
        		System.out.println("getHoursInWeeks passed test 1!");
        	} else {
        		System.out.println("getHoursInWeeks failed test 1. Expected="
        				+ hoursInOneWeek + " Got=" + getHoursInWeeks(1));
        	}
        	
        	if (getHoursInWeeks(4) == hoursInFourWeeks) {
        		System.out.println("getHoursInWeeks passed test 2!");
        	} else {
        		System.out.println("getHoursInWeeks failed test 2. Expected="
        				+ hoursInFourWeeks + " Got=" + getHoursInWeeks(4));
        	}
        	
        	if (getHoursInWeeks(0) == hoursInZeroWeeks) {
        		System.out.println("getHoursInWeeks passed test 3!");
        	} else {
        		System.out.println("getHoursInWeeks failed test 3. Expected="
        				+ hoursInZeroWeeks + " Got=" + getHoursInWeeks(0));
        	}
        }

    	// isEven test
        {
            boolean isTwoEven = true;
            boolean isOneEven = false;
            boolean isZeroEven = true;
            boolean isEightyOneEven = false;
            
            System.out.println("----------------------");
            
            if (isEven(2) == isTwoEven) {
        		System.out.println("isEven passed test 1!");
        	} else {
        		System.out.println("isEven failed test 1. Expected="
        				+ isTwoEven + " Got=" + isEven(2));
        	}
            
            if (isEven(1) == isOneEven) {
        		System.out.println("isEven passed test 2!");
        	} else {
        		System.out.println("isEven failed test 2. Expected="
        				+ isOneEven + " Got=" + isEven(1));
        	}
            
            if (isEven(0) == isZeroEven) {
        		System.out.println("isEven passed test 3!");
        	} else {
        		System.out.println("isEven failed test 3. Expected="
        				+ isZeroEven + " Got=" + isEven(0));
        	}
            
            if (isEven(81) == isEightyOneEven) {
        		System.out.println("isEven passed test 4!");
        	} else {
        		System.out.println("isEven failed test 4. Expected="
        				+ isEightyOneEven + " Got=" + isEven(81));
        	}
        }

        // checkGrade test
        {
            String gradeEighty = "pass";
            String gradeHundredAndFive = "pass";
            String gradeFifty = "pass";
            String gradeZero = "fail";
            String gradeNegative = "fail";
            
            System.out.println("----------------------");
            
            if (gradeEighty.equalsIgnoreCase(checkGrade(80))) {
        		System.out.println("checkGrade passed test 1!");
        	} else {
        		System.out.println("checkGrade failed test 1. Expected="
        				+ gradeEighty + " Got=" + checkGrade(80));
        	}
            
            if (gradeHundredAndFive.equalsIgnoreCase(checkGrade(105))) {
        		System.out.println("checkGrade passed test 2!");
        	} else {
        		System.out.println("checkGrade failed test 2. Expected="
        				+ gradeHundredAndFive + " Got=" + checkGrade(105));
        	}
            
            if (gradeFifty.equalsIgnoreCase(checkGrade(50))) {
        		System.out.println("checkGrade passed test 3!");
        	} else {
        		System.out.println("checkGrade failed test 3. Expected="
        				+ gradeFifty + " Got=" + checkGrade(50));
        	}
            
            if (gradeZero.equalsIgnoreCase(checkGrade(0))) {
        		System.out.println("checkGrade passed test 4!");
        	} else {
        		System.out.println("checkGrade failed test 4. Expected="
        				+ gradeZero + " Got=" + checkGrade(0));
        	}
            
            if (gradeNegative.equalsIgnoreCase(checkGrade(-5))) {
        		System.out.println("checkGrade passed test 5!");
        	} else {
        		System.out.println("checkGrade failed test 5. Expected="
        				+ gradeNegative + " Got=" + checkGrade(-5));
        	}
        }

        // getSum test
        {
        	ArrayList<Integer> testOne = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 10, 2}));
        	ArrayList<Integer> testTwo = new ArrayList<Integer>(Arrays.asList(new Integer[] {100}));
        	ArrayList<Integer> testThree = new ArrayList<Integer>();
        	
        	System.out.println("----------------------");
        	
        	if (getSum(testOne) == 13) {
        		System.out.println("getSum passed test 1!");
        	} else {
        		System.out.println("getSum failed test 1. Expected=13"
        				+  " Got=" + getSum(testOne));
        	}
        	
        	if (getSum(testTwo) == 100) {
        		System.out.println("getSum passed test 2!");
        	} else {
        		System.out.println("getSum failed test 2. Expected=100"
        				+  " Got=" + getSum(testTwo));
        	}
        	
        	if (getSum(testThree) == 0) {
        		System.out.println("getSum passed test 3!");
        	} else {
        		System.out.println("getSum failed test 3. Expected=0"
        				+  " Got=" + getSum(testThree));
        	}
        }

        // getAverage test
        {
        	ArrayList<Integer> testOne = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 10, 2}));        	
        	ArrayList<Integer> testTwo = new ArrayList<Integer>(Arrays.asList(new Integer[] {50, 100}));
        	ArrayList<Integer> testThree = new ArrayList<Integer>(Arrays.asList(new Integer[] {0}));
        	
        	System.out.println("----------------------");
        	
        	if (getAverage(testOne) == 13.0/3) {
        		System.out.println("getAverage passed test 1!");
        	} else {
        		System.out.println("getAverage failed test 1. Expected="
        				+  13.0/3 + " Got=" + getAverage(testOne));
        	}
        	
        	if (getAverage(testTwo) == 75) {
        		System.out.println("getAverage passed test 2!");
        	} else {
        		System.out.println("getAverage failed test 2. Expected="
        				+  75 + " Got=" + getAverage(testTwo));
        	}
        	
        	if (getAverage(testThree) == 0) {
        		System.out.println("getAverage passed test 3!");
        	} else {
        		System.out.println("getAverage failed test 3. Expected="
        				+  0 + " Got=" + getAverage(testThree));
        	}
        }

        // makeSentence test
        {
        	ArrayList<String> testOne = new ArrayList<String>(Arrays.asList(new String[] {"Hi", "there"}));
        	String resultOne = "Hi there";
        	ArrayList<String> testTwo = new ArrayList<String>(Arrays.asList(new String[] {"How", "are", "you"}));
        	String resultTwo = "How are you";
        	ArrayList<String> testThree = new ArrayList<String>();
        	String resultThree = "";
        	
    		System.out.println("----------------------");
        	
        	if (resultOne.equals(makeSentence(testOne))) {
        		System.out.println("makeSentence passed test 1!");
        	} else {
        		System.out.println("makeSentence failed test 1. Expected="
        				+  resultOne + " Got=" + makeSentence(testOne));
        	}
        	
        	if (resultTwo.equals(makeSentence(testTwo))) {
        		System.out.println("makeSentence passed test 2!");
        	} else {
        		System.out.println("makeSentence failed test 2. Expected="
        				+  resultTwo + " Got=" + makeSentence(testTwo));
        	}
        	
        	if (resultThree.equals(makeSentence(testThree))) {
        		System.out.println("makeSentence passed test 3!");
        	} else {
        		System.out.println("makeSentence failed test 3. Expected="
        				+  resultThree + " Got=" + makeSentence(testThree));
        	}
        }
        
        // createNumberMap test
        {
        	HashMap<Integer, String> results = createNumberMap();
        	
        	System.out.println("----------------------");
        	
        	if (results != null) {
	        	boolean checkNumKeys = results.keySet().size() == 10;
	        	boolean checkAllKeys = results.containsKey(1) 
	        			&& results.containsKey(2)
	        			&& results.containsKey(3)
	        			&& results.containsKey(4)
	        			&& results.containsKey(5)
	        			&& results.containsKey(6)
	        			&& results.containsKey(7)
	        			&& results.containsKey(8)
	        			&& results.containsKey(9)
	        			&& results.containsKey(10);
	        	if (checkNumKeys && checkAllKeys) {
	        		boolean checkAllValues = results.get(1).equalsIgnoreCase("one")
	        				&& results.get(2).equalsIgnoreCase("two")
	        				&& results.get(3).equalsIgnoreCase("three")
	        				&& results.get(4).equalsIgnoreCase("four")
	        				&& results.get(5).equalsIgnoreCase("five")
	        				&& results.get(6).equalsIgnoreCase("six")
	        				&& results.get(7).equalsIgnoreCase("seven")
	        				&& results.get(8).equalsIgnoreCase("eight")
	        				&& results.get(9).equalsIgnoreCase("nine")
	        				&& results.get(10).equalsIgnoreCase("ten");
	        		if (checkAllValues) {
	            		System.out.println("createNumberMap passed test!");
	        		} else {
	        			System.out.println("createNumberMap failed to contain the correct values.");
	                }
	        	} else {
	        		System.out.println("createNumberMap failed to contain the correct keys.");
	        	}
        	} else {
        		System.out.println("createNumberMap is returning a null object.");
        	}
        }
        
        // getNumberText test
        {
        	int testOne = 1;
        	String resultOne = "one";
        	
        	int testTwo = 0;
        	String resultTwo = "not found";
        	
        	int testThree = -1;
        	String resultThree = "not found";
        	
        	System.out.println("----------------------");
        	
        	if (resultOne.equalsIgnoreCase(getNumberText(testOne))) {
        		System.out.println("getNumberText passed test 1!");
        	} else {
        		System.out.println("getNumberText failed test 1. Expected="
        				+  resultOne + " Got=" + getNumberText(testOne));
        	}
        	
        	if (resultTwo.equalsIgnoreCase(getNumberText(testTwo))) {
        		System.out.println("getNumberText passed test 2!");
        	} else {
        		System.out.println("getNumberText failed test 2. Expected="
        				+  resultTwo + " Got=" + getNumberText(testTwo));
        	}
        	
        	if (resultThree.equalsIgnoreCase(getNumberText(testThree))) {
        		System.out.println("getNumberText passed test 3!");
        	} else {
        		System.out.println("getNumberText failed test 3. Expected="
        				+  resultThree + " Got=" + getNumberText(testThree));
        	}
        }
        
        // getFibonacciNumber test
        {
        	int testOneIndex = 1;
        	int resultOne = 1;
        	
        	int testTwoIndex = 4;
        	int resultTwo = 3;
        	
        	int testThreeIndex = 10;
        	int resultThree = 55;
        	
        	System.out.println("----------------------");
        	
        	if (resultOne == getFibonacciNumber(testOneIndex)) {
        		System.out.println("getFibonacciNumber passed test 1!");
        	} else {
        		System.out.println("getFibonacciNumber failed test 1. Expected="
        				+  resultOne + " Got=" + getFibonacciNumber(testOneIndex));
        	}
        	
        	if (resultTwo == getFibonacciNumber(testTwoIndex)) {
        		System.out.println("getFibonacciNumber passed test 2!");
        	} else {
        		System.out.println("getFibonacciNumber failed test 2. Expected="
        				+  resultTwo + " Got=" + getFibonacciNumber(testTwoIndex));
        	}
        	
        	if (resultThree == getFibonacciNumber(testThreeIndex)) {
        		System.out.println("getFibonacciNumber passed test 3!");
        	} else {
        		System.out.println("getFibonacciNumber failed test 3. Expected="
        				+  resultThree + " Got=" + getFibonacciNumber(testThreeIndex));
        	}
        }
        
        // getDuplicates test
        {
        	LinkedList<Integer> testOne = new LinkedList<Integer>(Arrays.asList(new Integer[] {1, 1, 2}));
        	ArrayList<Integer> resultOne = new ArrayList<Integer>(Arrays.asList(new Integer[] {1}));
        	HashSet<Integer> resultSetOne = getDuplicates(testOne);
        	
        	LinkedList<Integer> testTwo = new LinkedList<Integer>(Arrays.asList(new Integer[] {1, 1, 1, 1}));
        	ArrayList<Integer> resultTwo = new ArrayList<Integer>(Arrays.asList(new Integer[] {1}));
        	HashSet<Integer> resultSetTwo = getDuplicates(testTwo);
        	
        	LinkedList<Integer> testThree = new LinkedList<Integer>();
        	ArrayList<Integer> resultThree = new ArrayList<Integer>();
        	HashSet<Integer> resultSetThree = getDuplicates(testThree);
        	
        	LinkedList<Integer> testFour = new LinkedList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4}));
        	ArrayList<Integer> resultFour = new ArrayList<Integer>();
        	HashSet<Integer> resultSetFour = getDuplicates(testFour);
        	
        	
        	System.out.println("----------------------");
        	
        	if (resultSetOne == null) {
        		System.out.println("getDuplicates failed test 1. Expected="
        				+  resultOne + " Got=" + resultSetOne);
        	} else if (resultOne.containsAll(resultSetOne) && resultSetOne.size() == resultOne.size()){
        		System.out.println("getDuplicates passed test 1!");
        	}
        	
        	if (resultSetTwo == null) {
        		System.out.println("getDuplicates failed test 2. Expected="
        				+  resultTwo + " Got=" + resultSetTwo);
        	} else if (resultTwo.containsAll(resultSetTwo) && resultSetTwo.size() == resultTwo.size()){
        		System.out.println("getDuplicates passed test 2!");
        	}
        	
        	if (resultSetThree == null) {
        		System.out.println("getDuplicates failed test 3. Expected="
        				+  resultThree + " Got=" + resultSetThree);
        	} else if (resultSetThree.size() == 0){
        		System.out.println("getDuplicates passed test 3!");
        	}
        	
        	if (resultSetFour == null) {
        		System.out.println("getDuplicates failed test 4. Expected="
        				+  resultFour + " Got=" + resultSetFour);
        	} else if (resultSetFour.size() == 0){
        		System.out.println("getDuplicates passed test 4!");
        	}
        }
        
        System.out.println("----------------------");
        System.out.println( "YOU ARE AWESOME!" );
    }

}

