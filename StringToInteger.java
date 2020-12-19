
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
