# leetcode-string-problems

## 1)	Reverse String

Write a function that reverses a string. The input string is given as an array of characters char[].
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
You may assume all the characters consist of printable ascii characters.

```
public class StringReverse {
	public char[] reverseString(char[] a) {
        char temp = ' ';
        int length = a.length;
        System.out.println("Length="+length);
        int j=length-1;
        for(int i=0;i<=(length/2)-1;i++){
            
            if(i!=j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }else{
                break;
            }    
        }
        return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse m = new StringReverse();
		char[] a = {'h','e','l','l','o'};
		System.out.println(m.reverseString(a));
	}
}
```

> Input: ["h","e","l","l","o"]

> Output: ["o","l","l","e","h"]

## 2) Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

```
public class ReverseInteger {

	public int reverse(int x) {
        int reverse = 0;
        while(x!=0){
            int pop = x%10;
            x = x/10;
            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && pop>7)) return 0;
            if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && pop<-8)) return 0;
            reverse = reverse * 10 + pop;
        }
        return reverse;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger I = new ReverseInteger();
		System.out.println("Reverse Integer = "+I.reverse(123));
	}
}
```

> Input: x = 123

> Output: 321

## 3) Valid Anagram

Given two strings s and t , write a function to determine if t is an anagram of s.

```
import java.util.Arrays;

public class ValidAnagram {
public boolean isAnagram(String s, String t) {
        
        char[] s1 = new char[s.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < s.length(); i++) { 
            s1[i] = s.charAt(i); 
        } 
        
        char[] t1 = new char[t.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < t.length(); i++) { 
            t1[i] = t.charAt(i); 
        } 
        
        int n1 = s.length();
        int n2 = t.length();
        
        
        if(n1 != n2)
            return false;
        
        Arrays.sort(s1);
        Arrays.sort(t1);
        
        for(int i=0;i<n1;i++){
            if(s1[i]!=t1[i])
                return false;
        }
        
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidAnagram A = new ValidAnagram();
		String s = "listen";
		String t = "silent";
		System.out.println("Is Anagram? "+A.isAnagram(s, t));
	}

}
```

> Input: s = "listen", t = "silent"

> Output: Is Anagram? True

## 4) Valid Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

```
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
```

> Input: "A man, a plan, a canal: Panama"

> Output: true

## 5) String to Integer (atoi)

Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

```
public class StringToInteger {
	static int myAtoi(String s)
    {
		char str[] = s.toCharArray();
        if(str.length==0 )
            return 0;
        
        int sign = 1, base = 0, i = 0;
        // if whitespaces then ignore.
        while (str[i] == ' ' && str.length-1!=i)
        {
            i++;
        }
        // sign of number
        if (str[i] == '-' || str[i] == '+')
        {
            sign = 1 - 2 * (str[i++] == '-' ? 1 : 0);
        }
        // checking for valid input
        while (i < str.length 
               && str[i] >= '0'
               && str[i] <= '9') {
            // handling overflow test case
            if (base > Integer.MAX_VALUE / 10
                || (base == Integer.MAX_VALUE / 10
                    && str[i] - '0' > 7)) 
            {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  -42";
	       
        // Function call
        int val = myAtoi(s);
        System.out.printf("%d ", val);
	}
}
```

> Input: str = "   -42"

> Output: -42






