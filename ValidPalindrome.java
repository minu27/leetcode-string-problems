
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		
		int i=0; int j=s.length()-1;
		while(j>i){
			while(j>i && !Character.isLetterOrDigit(s.charAt(i))){
			i++;
			}
			
			while(j>i && !Character.isLetterOrDigit(s.charAt(j))){
			j--;
			}
			
			if(j>i && Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
			return false;
			}
			
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome P = new ValidPalindrome();
		String s= "A man, a plan, a canal: Panama";
		System.out.println("Is Palindrome? "+P.isPalindrome(s));
	}

}
