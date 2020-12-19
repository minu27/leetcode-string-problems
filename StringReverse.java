
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
		//char[] a = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
		char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println(m.reverseString(a));
	}

}
