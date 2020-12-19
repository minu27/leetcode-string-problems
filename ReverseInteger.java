
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
