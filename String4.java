package basic;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = s1;
		
		if(s1==s2)
			System.out.println("Equal  ");
		else 
			System.out.println("Non equal");
		
		if(s3==s1)
			System.out.println("Equal  ");
		else 
			System.out.println("Non equal");
		
		if(s1.equals(s2))
			System.out.println("Equal  ");
		else 
			System.out.println("Non equal");
	}

}
