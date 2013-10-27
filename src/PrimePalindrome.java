import java.lang.Math;

public class PrimePalindrome {
	
	public boolean isPrime (int n){
		int k = 2;
		int limit = (int) Math.round(Math.sqrt(n));
		while (k <= limit){
			if (n%k == 0)
				return false;
			k++;
		}
		return true;
	}

	public boolean isPalindrome (int m) {
		if (m<10){
			return true;
		}
		String temp = Integer.toString(m);
		for (int j = 0; j < temp.length()/2; j++){
			if (temp.charAt(j)!= temp.charAt(temp.length()-1-j))
				return false;
		}
		return true;
	}
	
	public int getClosest (String s){
		for (int i = Integer.parseInt(s); i > 1; i--){
			if (isPalindrome(i)){
				if (isPrime(i)){
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String param){
		PrimePalindrome game = new PrimePalindrome();
		int a = game.getClosest(param);
		if ( a >= 0 )
			System.out.println(a);
		else
			System.out.println("Prime palindrome not found");
	}
}
