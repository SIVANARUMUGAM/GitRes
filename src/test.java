
public class test {

	public static void main(String[] args) {
		String str="123abc";
		int n =10;
		//int n=Integer.parseInt(str);
		
		//System.out.println(n);
		
		
		String s=Integer.toString(n);
		String s1=String.valueOf(n);
		
		System.out.println(s);
		System.out.println(s1);
		
		
		String str1 = "abcd1234";
		String[] part = str1.split("(?<=\\D)(?=\\d)");
		System.out.println(part[0]);
		System.out.println(part[1]);
		
		String a = "abcd1234";
		int i;
		for(i = 0; i < a.length(); i++){
		    char c = a.charAt(i);
		    if( '0' <= c && c <= '9' )
		        break;
		}
		String alphaPart = a.substring(0, i);
		String numberPart = a.substring(i);
		
		System.out.println(alphaPart);
		System.out.println(numberPart);
	}

}

