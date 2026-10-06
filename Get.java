package basic;
class Sup
{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}

public class Get extends Sup {
	public static void main(String [] args)
	{
		Get obj = new Get();
		obj.setA(10);
		int ab = obj.getA();
		System.out.println(ab );
				
	}
}
