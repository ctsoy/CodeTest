import static org.junit.Assert.*;

import org.junit.Test;


public class testPrimePalindrome {

	@Test
	public void testPrime() {
		PrimePalindrome test1 = new PrimePalindrome();
		assertTrue("5 is a prime.", test1.isPrime(5));
		assertFalse("10 is not a prime.", test1.isPrime(10));
		assertTrue("97 is a prime.", test1.isPrime(97));
		assertFalse("98 is not a prime.", test1.isPrime(98));
	}
	
	public void testPalindrome(){
		PrimePalindrome test2 = new PrimePalindrome();
		assertTrue("99 is a palindrome.", test2.isPalindrome(99));
		assertFalse("1010 is not a palindrome.", test2.isPalindrome(1010));
		assertTrue("929 is a palindrome.", test2.isPalindrome(929));
		assertFalse("103 is not a palindrome.", test2.isPalindrome(103));
		assertTrue("3 is a palindrome.", test2.isPalindrome(3));
	}
	
	public void testBoth(){
		PrimePalindrome test3 = new PrimePalindrome();
		assertTrue("191 is both.", test3.isPalindrome(191)&&test3.isPrime(191));
		assertFalse("121 is not both", test3.isPalindrome(121)&&test3.isPrime(121));
		assertTrue("7 is both.", test3.isPalindrome(7)&&test3.isPrime(7));
		assertFalse("13 is not both.", test3.isPalindrome(13)&&test3.isPrime(13));
	}

}
