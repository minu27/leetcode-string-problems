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
		char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println(m.reverseString(a));
	}
}
```
> Input: ["h","e","l","l","o"]

> Output: ["o","l","l","e","h"]



