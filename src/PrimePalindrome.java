
public class PrimePalindrome {
	
	public boolean isPrime(int n){
		int k = 2;
		while (k < (n/2)+1){
			if (n%k == 0)
				return false;
			k++;
		}
		return true;
	}

	public boolean isPalindrome(int m) {
		String temp = Integer.toString(m);
		for (int j = 0; j < temp.length()/2; j++){
			if (temp.charAt(j)!= temp.charAt(temp.length()-1-j))
				return false;
		}
		return true;
	}

	public static void main(String[] args){
		PrimePalindrome game = new PrimePalindrome();
		for (int i = Integer.parseInt(args[0]); i > 9; i--){
			if (game.isPalindrome(i)){
				if (game.isPrime(i)){
					System.out.println(i);
				}
			}
		}
	}
}
