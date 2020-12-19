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






