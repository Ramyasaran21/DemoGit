package Assignment1;

public class Q4ArraypalindromeChecker {
	

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 2, 1}; 
	        boolean isPalindrome = checkArrayPalindrome(numbers);
	        
	        if (isPalindrome) {
	            System.out.println("The array is a palindrome.");
	        } else {
	            System.out.println("The array is not a palindrome.");
	        }
	    }
	    
	    public static boolean checkArrayPalindrome(int[] array) {
	        int start = 0;
	        int end = array.length - 1;
	        
	        while (start < end) {
	            if (array[start] != array[end]) {
	                return false;
	            }
	            
	            start++;
	            end--;
	        }
	        
	        return true;
	    }
	}




