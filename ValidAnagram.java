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
