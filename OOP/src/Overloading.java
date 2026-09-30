
public class Overloading  {
	  void add(String s )
	  {
		  System.out.println("Sting");
	  }
	  void add(int a )
	  {
		  System.out.println("Integer");
	  }
	  
	public static void main(String[] args) {
		Overloading tt = new Overloading();
		tt.add("Letter");
		tt.add(0);
		
	}
}