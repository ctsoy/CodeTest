import static org.junit.Assert.*;

import org.junit.Test;


public class testPrimePalindrome {

	@Test
	// Test if the integer is a prime number.
	public void testPrime() {
		PrimePalindrome test1 = new PrimePalindrome();
		assertTrue("5 is a prime.", test1.isPrime(5));
		assertFalse("10 is not a prime.", test1.isPrime(10));
		assertTrue("97 is a prime.", test1.isPrime(97));
		assertFalse("98 is not a prime.", test1.isPrime(98));
		assertFalse("121 is not a prime.", test1.isPrime(121));
		assertTrue("929 is a prime.", test1.isPrime(929));
	}
	
	@Test
	// Test if the integer is a palindrome 
	public void testPalindrome(){
		PrimePalindrome test2 = new PrimePalindrome();
		assertTrue("99 is a palindrome.", test2.isPalindrome(99));
		assertFalse("1010 is not a palindrome.", test2.isPalindrome(1010));
		assertTrue("929 is a palindrome.", test2.isPalindrome(929));
		assertFalse("103 is not a palindrome.", test2.isPalindrome(103));
		assertTrue("3 is a palindrome.", test2.isPalindrome(3));
		assertTrue("0 is a palindrome.", test2.isPalindrome(0));
		assertTrue("1 is a palindrome.", test2.isPalindrome(1));
	}
	/*
	@Test
	// Test if the integer is both a prime number and a palindrome
	public void testBoth(){
		PrimePalindrome test3 = new PrimePalindrome();
		assertTrue("191 is both.", test3.isPalindrome(191)&&test3.isPrime(191));
		assertFalse("121 is not both", test3.isPalindrome(121)&&test3.isPrime(121));
		assertTrue("7 is both.", test3.isPalindrome(7)&&test3.isPrime(7));
		assertFalse("13 is not both.", test3.isPalindrome(13)&&test3.isPrime(13));
	}*/
	
	@Test
	// Test if given a number, getClosest would return the closest prime palindrome.
	public void testClosest(){
		PrimePalindrome test4 = new PrimePalindrome();
		assertEquals("929 is the closest to 1000.", 929, test4.getClosest("1000"));
		assertEquals("191 is the closest to 200.", 191, test4.getClosest("200"));
		assertEquals("7 is the closest to 10.", 7, test4.getClosest("10"));
		assertEquals("11 is the closest to 100.", 11, test4.getClosest("100"));
		assertEquals("No prime palindrome for 0", -1, test4.getClosest("0"));
		assertEquals("No prime palindrome for 1", -1, test4.getClosest("1"));
	}

}
